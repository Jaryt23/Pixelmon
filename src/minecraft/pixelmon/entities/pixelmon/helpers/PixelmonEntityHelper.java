//package pixelmon.entities.pixelmon.helpers;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
//import pixelmon.Pixelmon;
//import pixelmon.RandomHelper;
//import pixelmon.battles.BattleController;
//import pixelmon.battles.Moveset;
//import pixelmon.battles.attacks.Attack;
//import pixelmon.battles.attacks.statusEffects.StatusEffectBase;
//import pixelmon.battles.participants.IBattleParticipant;
//import pixelmon.battles.participants.PlayerParticipant;
//import pixelmon.battles.participants.TrainerParticipant;
//import pixelmon.battles.participants.WildPixelmonParticipant;
//import pixelmon.comm.ChatHandler;
//import pixelmon.config.PixelmonEntityList;
//import pixelmon.config.PixelmonItems;
//import pixelmon.database.BattleStats;
//import pixelmon.database.DatabaseMoves;
//import pixelmon.database.DatabaseStats;
//import pixelmon.database.EvolutionInfo;
//import pixelmon.database.Stats;
//import pixelmon.entities.EntityTrainer;
//import pixelmon.entities.pixelmon.EntityPixelmon;
//import pixelmon.entities.pixelmon.EntityWaterPixelmon;
//import pixelmon.entities.pixelmon.helpers.IHaveHelper;
//import pixelmon.entities.pixelmon.helpers.PixelmonEntityHelper;
//import pixelmon.enums.EnumGui;
//import pixelmon.enums.EnumPokeballs;
//import pixelmon.enums.EnumType;
//import pixelmon.items.ItemEvolutionStone;
//import pixelmon.storage.PixelmonStorage;
//
//import net.minecraft.src.DamageSource;
//import net.minecraft.src.Entity;
//import net.minecraft.src.EntityItem;
//import net.minecraft.src.EntityLiving;
//import net.minecraft.src.EntityLookHelper;
//import net.minecraft.src.EntityPlayer;
//import net.minecraft.src.EntityPlayerMP;
//import net.minecraft.src.ItemStack;
//import net.minecraft.src.MathHelper;
//
//import net.minecraft.src.NBTTagCompound;
//import net.minecraft.src.Vec3;
//import net.minecraft.src.World;
//
//public class PixelmonEntityHelper {
////	public Moveset moveset = new Moveset();
////	public Stats stats = new Stats();
////	public BattleStats battleStats = new BattleStats();
////	public ArrayList<StatusEffectBase> status = new ArrayList<StatusEffectBase>();
////	public boolean isMale;
////	public String nickname = "";
////	public boolean isInBall = true;
////	public boolean isFainted = false;
////	public Aggression aggression;
////	public float scale = 1F;
////	public float maxScale = 1.25F;
////	public BattleController bc;
////	public boolean wasBattleInitiator = false;
////	public LevelHelper lvl;
////	public float giScale = 1;
////	public ItemStack heldItem;
//
//	
//
//
//
//	public void loadMoveset() {
//		moveset = DatabaseMoves.GetInitialMoves(getName(), getLvl().getLevel());
//	}
//
//	public EntityLookHelper getLookHelper() {
//		if (pixelmon instanceof EntityPixelmon)
//			return ((EntityPixelmon) pixelmon).getLookHelper();
//		else if (pixelmon instanceof EntityWaterPixelmon)
//			return ((EntityWaterPixelmon) pixelmon).getLookHelper();
//		return null;
//	}
//
//	public String getName() {
//		if (pixelmon instanceof EntityPixelmon) {
//			EntityPixelmon p = (EntityPixelmon) pixelmon;
//			return p.name;
//		} else if (pixelmon instanceof EntityWaterPixelmon) {
//			EntityWaterPixelmon p = (EntityWaterPixelmon) pixelmon;
//			return p.name;
//		}
//		return null;
//	}
//
//	public String getDisplayName() {
//		if (nickname == null || nickname.equals(""))
//			return getName();
//		else
//			return nickname;
//	}
//
//	public boolean attackEntityFrom(DamageSource dmgSource, int power) {
//		boolean flag = ((EntityLiving) pixelmon).attackEntityFrom(dmgSource, power);
//		Entity entity = dmgSource.getEntity();
//		if (pixelmon instanceof IHaveHelper) {
//			if (((IHaveHelper) pixelmon).getHelper().isValidTarget(entity)) {
//				((IHaveHelper) pixelmon).getHelper().setAttackTarget((EntityLiving) entity);
//				((IHaveHelper) pixelmon).getHelper().setTarget(entity);
//			}
//		}
//		return flag;
//	}
//
//	private void setTarget(Entity entity) {
//		if (entity instanceof EntityPixelmon)
//			((EntityPixelmon) entity).setTarget(entity);
//		else if (entity instanceof EntityWaterPixelmon)
//			((EntityWaterPixelmon) entity).setTarget(entity);
//	}
//
//	private void setAttackTarget(EntityLiving entity) {
//		if (entity instanceof EntityPixelmon)
//			((EntityPixelmon) entity).setAttackTarget(entity);
//		else if (entity instanceof EntityWaterPixelmon)
//			((EntityWaterPixelmon) entity).setAttackTarget(entity);
//	}
//
//	public ArrayList<EnumType> getType() {
//		if (pixelmon instanceof EntityPixelmon)
//			return ((EntityPixelmon) pixelmon).type;
//		else if (pixelmon instanceof EntityWaterPixelmon)
//			return ((EntityWaterPixelmon) pixelmon).type;
//		return null;
//	}
//
//	
//
//	
//
//	public void EndBattle() {
//		if (pixelmon instanceof EntityWaterPixelmon)
//			((EntityWaterPixelmon) pixelmon).isSwimming = true;
//		bc = null;
//	}
//
//	public int getHealth() {
//		if (pixelmon instanceof EntityPixelmon)
//			return ((EntityPixelmon) pixelmon).getHealth();
//		else if (pixelmon instanceof EntityWaterPixelmon)
//			return ((EntityWaterPixelmon) pixelmon).getHealth();
//		return 0;
//	}
//
//	public int getMaxHealth() {
//		if (stats == null)
//			return 1;
//		return stats.HP;
//	}
//
//	public void setHealth(int i) {
//		if (pixelmon instanceof EntityPixelmon)
//			((EntityPixelmon) pixelmon).setHealth(i);
//		else if (pixelmon instanceof EntityWaterPixelmon)
//			((EntityWaterPixelmon) pixelmon).setHealth(i);
//	}
//
//	public void catchInPokeball() {
//		pixelmon.catchInPokeball();
//	}
//
//	public int getPokemonId() {
//		return pixelmon.getPokemonId();
//	}
//
//	public void writeEntityToNBT(NBTTagCompound nbt) {
//		pixelmon.writeEntityToStorageNBT(nbt);
//	}
//
//	public void setLocationAndAngles(double posX, double posY, double posZ, float rotationYaw, float f) {
//		pixelmon.setLocationAndAngles(posX, posY, posZ, rotationYaw, f);
//	}
//
//	public void setMotion(int i, int j, int k) {
//		if (pixelmon instanceof EntityPixelmon)
//			((EntityPixelmon) pixelmon).setMotion(i, j, k);
//		else if (pixelmon instanceof EntityWaterPixelmon)
//			((EntityWaterPixelmon) pixelmon).setMotion(i, j, k);
//	}
//
//	public void releaseFromPokeball() {
//		pixelmon.releaseFromPokeball();
//	}
//
//	public void clearAttackTarget() {
//		if (pixelmon instanceof EntityPixelmon) {
//			((EntityPixelmon) pixelmon).setTarget(null);
//			((EntityPixelmon) pixelmon).setAttackTarget(null);
//		} else if (pixelmon instanceof EntityWaterPixelmon) {
//			((EntityWaterPixelmon) pixelmon).setTarget(null);
//			((EntityWaterPixelmon) pixelmon).setAttackTarget(null);
//		}
//	}
//
//	public void setTamed(boolean b) {
//		if (pixelmon instanceof EntityPixelmon)
//			((EntityPixelmon) pixelmon).setTamed(b);
//		else if (pixelmon instanceof EntityWaterPixelmon)
//			((EntityWaterPixelmon) pixelmon).setTamed(b);
//	}
//
//	public void setLocationAndAngles(IHaveHelper currentPixelmon) {
//		if (pixelmon instanceof EntityPixelmon)
//			((EntityPixelmon) pixelmon).setLocationAndAngles(currentPixelmon);
//		else if (pixelmon instanceof EntityWaterPixelmon)
//			((EntityWaterPixelmon) pixelmon).setLocationAndAngles(currentPixelmon);
//	}
//
//	public void setPokemonID(int uniqueEntityId) {
//		pixelmon.setPokemonId(uniqueEntityId);
//	}
//
//	public void setPositionAndRotation(double posX, double posY, double posZ, float rotationYaw, float rotationPitch) {
//		pixelmon.setPositionAndRotation(posX, posY, posZ, rotationYaw, rotationPitch);
//	}
//
//	public Entity getEntity() {
//		return (Entity) pixelmon;
//	}
//
//	public void setHeldItem(ItemStack var1) {
//		heldItem = var1;
//	}
//
//	public ItemStack getHeldItem() {
//		return heldItem;
//	}
//
//	protected void copyTo(PixelmonEntityHelper entity) {
//		entity.setTamed(true);
//		entity.nickname = nickname;
//		entity.caughtBall = caughtBall;
//		entity.moveset.clear();
//		entity.isMale = isMale;
//		entity.setIsShiny(getIsShiny());
//		if (getHeldItem() != null)
//			entity.setHeldItem(getHeldItem().copy());
//		for (int i = 0; i < moveset.size(); i++)
//			entity.moveset.add(moveset.get(i));
//		entity.stats.IVs.CopyIVs(stats.IVs);
//		entity.getLvl().setLevel(getLvl().getLevel());
//		entity.getLvl().setEXP(getLvl().getExp());
//		if (pixelmon instanceof EntityPixelmon) {
//			EntityPixelmon p = (EntityPixelmon) pixelmon;
//			entity.setPositionAndRotation(p.posX, p.posY, p.posZ, p.rotationYaw, p.rotationPitch);
//		} else if (pixelmon instanceof EntityWaterPixelmon) {
//			EntityWaterPixelmon p = (EntityWaterPixelmon) pixelmon;
//			entity.setPositionAndRotation(p.posX, p.posY, p.posZ, p.rotationYaw, p.rotationPitch);
//		}
//	}
//
//	public void evolve(PixelmonEntityHelper entity) {
//		entity.setOwner(this.getOwner());
//		if (entity.getOwner() != null)
//			ChatHandler.sendChat(entity.getOwner(), "Your " + getName() + " evolved into " + entity.getName() + "!");
//		int oldHP = stats.HP;
//		copyTo(entity);
//		if (nickname.equals(getName()))
//			entity.nickname = entity.getName();
//		float percentIncrease = ((float) stats.HP) / ((float) oldHP);
//		setHealth((int) (((float) getHealth()) * percentIncrease));
//		PixelmonStorage.PokeballManager.getPlayerStorage((EntityPlayerMP) entity.getOwner()).replace(this, entity);
//		entity.getOwner().worldObj.spawnEntityInWorld((EntityLiving) entity.getEntity());
//		entity.setPokemonID(getPokemonId());
//		getEntity().setDead();
//		entity.getLvl().recalculateXP();
//		entity.getLvl().awardEXP(entity.getLvl().extraXP);
//	}
//
//	public IHaveHelper getIHaveHelper() {
//		return pixelmon;
//	}
//
//	public boolean interact(EntityPlayer entity) {
//		if (entity instanceof EntityPlayerMP) {
//			EntityPlayer entity1 = (EntityPlayer) entity;
//			ItemStack itemstack = entity1.getCurrentEquippedItem();
//			boolean flag = false;
//			// if (itemstack == null) {
//			// if (stats.BaseStats.IsRideable &&
//			// PixelmonStorage.PokeballManager.getPlayerStorage((EntityPlayerMP)entity).isIn(this))
//			// {
//			// entity.mountEntity((EntityLiving) pixelmon);
//			// return true;
//			// }
//			// return false;
//			// }
//
//			if (itemstack != null && itemstack.itemID == PixelmonItems.rareCandy.shiftedIndex && getOwner() == entity) {
//				getLvl().awardEXP(getLvl().getExpToNextLevel() - getLvl().getExp());
//				if (!entity.capabilities.isCreativeMode)
//					itemstack.stackSize--;
//				flag = true;
//			}
//			if (itemstack != null && itemstack.itemID == PixelmonItems.pokeChecker.shiftedIndex && getOwner() != null) {
//				if (getOwner() != null)
//					getOwner().openGui(Pixelmon.instance, EnumGui.PokeChecker.getIndex(), getOwner().worldObj, getPokemonId(), 0, 0); // Pokechecker
//				flag = true;
//			}
//			if (itemstack != null && itemstack.itemID == PixelmonItems.potion.shiftedIndex && getOwner() == entity) {
//				if (getHealth() + 20 > stats.HP)
//					setHealth(stats.HP);
//				else
//					setHealth(getHealth() + 20);
//				if (getOwner() != null)
//					PixelmonStorage.PokeballManager.getPlayerStorage((EntityPlayerMP) getOwner()).updateNBT(this);
//				lvl.updateEntityString();
//				if (!entity.capabilities.isCreativeMode)
//					itemstack.stackSize--;
//				if (getHealth() > stats.HP)
//					setHealth(stats.HP);
//				flag = true;
//			}
//			// if (itemstack.itemID == mod_Pixelmon.pokeDex.shiftedIndex) {
//			// if (getOwner() == entity) {
//			// getOwner().openGui(mod_Pixelmon.instance,
//			// EnumGui.Pokedex.getIndex(), getOwner().worldObj, getPokemonId(),
//			// 0, 0); // Pokedex
//			// flag = true;
//			// }
//			// }
//			if (itemstack != null && itemstack.getItem() instanceof ItemEvolutionStone && getOwner() == entity) {
//				ItemEvolutionStone i = (ItemEvolutionStone) itemstack.getItem();
//				for (EvolutionInfo e : getEvolveList()) {
//					if (e.evolutionStone == i.getType()) {
//						EntityPixelmon evolveTo = (EntityPixelmon) PixelmonEntityList.createEntityByName(e.pokemonName, getOwner().worldObj);
//						if (evolveTo == null) {
//							break;
//						}
//						evolve(evolveTo.helper);
//						flag = true;
//						itemstack.stackSize--;
//						break;
//					}
//				}
//			}
//			if (!flag && getOwner() == entity) {
//				if (getHeldItem() != null) {
//					if (pixelmon instanceof EntityWaterPixelmon) {
//						if (!((EntityWaterPixelmon) pixelmon).worldObj.isRemote) {
//							((EntityWaterPixelmon) pixelmon).entityDropItem(heldItem.copy(), 1f);
//						}
//					} else if (pixelmon instanceof EntityPixelmon) {
//						if (!((EntityPixelmon) pixelmon).worldObj.isRemote) {
//							((EntityPixelmon) pixelmon).entityDropItem(heldItem.copy(), 1f);
//						}
//					}
//					setHeldItem(null);
//				}
//				if (itemstack != null) {
//					ItemStack itemstack1 = itemstack.copy();
//					itemstack1.stackSize = 1;
//					itemstack.stackSize--;
//					this.setHeldItem(itemstack1);
//				}
//				if (entity instanceof EntityPlayerMP) {
//					PixelmonStorage.PokeballManager.getPlayerStorage((EntityPlayerMP) getOwner()).updateNBT(this);
//				}
//				flag = true;
//			}
//			if (itemstack != null && itemstack.stackSize <= 0)
//				entity.inventory.setInventorySlotContents(entity.inventory.currentItem, null);
//			return flag;
//		}
//
//		return false;
//	}
//
//	public boolean isValidTarget(Entity entity) {
//		if (!(entity instanceof IHaveHelper))
//			return false;
//
//		if (getOwner() == ((IHaveHelper) entity).getHelper().getOwner()) {
//			return false;
//		}
//
//		return true;
//	}
//
//	public void readFromNBT(NBTTagCompound var1) {
//		getLvl().readFromNBT(var1);
//		setHealth(var1.getShort("Health"));
//		setPokemonID(var1.getInteger("pixelmonID"));
//		stats.readFromNBT(var1);
//		if (getHealth() > stats.HP)
//			setHealth(stats.HP);
//		isInBall = var1.getBoolean("IsInBall");
//		nickname = var1.getString("Nickname");
//		scale = var1.getFloat("Scale");
//		isFainted = var1.getBoolean("IsFainted");
//		isMale = var1.getBoolean("IsMale");
//		setIsShiny(var1.getBoolean("IsShiny"));
//		battleStats.readFromNBT(var1);
//		moveset.readFromNBT(var1);
//		if (var1.hasKey("Held Item")) {
//			if (var1.getCompoundTag("Held Item").hasKey("Remove")) {
//				heldItem = null;
//			} else {
//				heldItem = ItemStack.loadItemStackFromNBT(var1.getCompoundTag("Held Item"));
//			}
//		}
//		if (var1.hasKey("CaughtBall"))
//			caughtBall = EnumPokeballs.getFromIndex(var1.getInteger("CaughtBall"));
//		else
//			caughtBall = EnumPokeballs.PokeBall;
//		getLvl().updateEntityString();
//	}
//
//	public void writeToNBT(NBTTagCompound var1) {
//		getLvl().writeToNBT(var1);
//		var1.setInteger("pixelmonID", getPokemonId());
//		var1.setString("Name", getName());
//		if (nickname != null && !nickname.equalsIgnoreCase("")) {
//			var1.setString("Nickname", nickname);
//		} else {
//			var1.setString("Nickname", getName());
//		}
//		if (caughtBall != null)
//			var1.setInteger("CaughtBall", caughtBall.getIndex());
//		var1.setBoolean("IsInBall", isInBall);
//		var1.setFloat("Scale", scale);
//		var1.setBoolean("IsFainted", isFainted || getIsDead());
//		var1.setBoolean("IsMale", isMale);
//		var1.setBoolean("IsShiny", getIsShiny());
//		battleStats.writeToNBT(var1);
//		moveset.writeToNBT(var1);
//		stats.writeToNBT(var1);
//		if (heldItem != null) {
//			var1.setCompoundTag("Held Item", heldItem.writeToNBT(new NBTTagCompound()));
//		} else {
//			NBTTagCompound comp = new NBTTagCompound();
//			comp.setBoolean("Remove", true);
//			var1.setCompoundTag("Held Item", comp);
//		}
//	}
//
//	public boolean getIsDead() {
//		if (pixelmon instanceof EntityPixelmon)
//			return ((EntityPixelmon) pixelmon).isDead;
//		else if (pixelmon instanceof EntityWaterPixelmon)
//			return ((EntityWaterPixelmon) pixelmon).isDead;
//		return false;
//	}
//
//	public ArrayList<EvolutionInfo> getEvolveList() {
//		return DatabaseStats.getEvolveList(getName());
//	}
//
//	public void unloadEntity() {
//		if (pixelmon instanceof EntityPixelmon)
//			((EntityPixelmon) pixelmon).unloadEntity();
//		else if (pixelmon instanceof EntityWaterPixelmon)
//			((EntityWaterPixelmon) pixelmon).unloadEntity();
//	}
//
//	public void setTrainer(EntityTrainer trainer) {
//		if (pixelmon instanceof EntityPixelmon) {
//			((EntityPixelmon) pixelmon).trainer = trainer;
//		} else if (pixelmon instanceof EntityWaterPixelmon) {
//			((EntityWaterPixelmon) pixelmon).trainer = trainer;
//		}
//	}
//
//	public EntityTrainer getTrainer() {
//		if (pixelmon instanceof EntityPixelmon) {
//			return ((EntityPixelmon) pixelmon).trainer;
//		} else if (pixelmon instanceof EntityWaterPixelmon) {
//			return ((EntityWaterPixelmon) pixelmon).trainer;
//		}
//		return null;
//	}
//
//	public void updateLvlString(String string) {
//		if (pixelmon instanceof EntityPixelmon) {
//			((EntityPixelmon) pixelmon).setLvlString(string);
//		} else if (pixelmon instanceof EntityWaterPixelmon)
//			((EntityWaterPixelmon) pixelmon).setLvlString(string);
//	}
//
//	public int getXPos() {
//		if (pixelmon instanceof EntityPixelmon) {
//			return (int) ((EntityPixelmon) pixelmon).posX;
//		} else if (pixelmon instanceof EntityWaterPixelmon) {
//			return (int) ((EntityWaterPixelmon) pixelmon).posX;
//		}
//		return 0;
//	}
//
//	public int getYPos() {
//		if (pixelmon instanceof EntityPixelmon) {
//			return (int) ((EntityPixelmon) pixelmon).posY;
//		} else if (pixelmon instanceof EntityWaterPixelmon) {
//			return (int) ((EntityWaterPixelmon) pixelmon).posY;
//		}
//		return 0;
//	}
//
//	public int getZPos() {
//		if (pixelmon instanceof EntityPixelmon) {
//			return (int) ((EntityPixelmon) pixelmon).posZ;
//		} else if (pixelmon instanceof EntityWaterPixelmon) {
//			return (int) ((EntityWaterPixelmon) pixelmon).posZ;
//		}
//		return 0;
//	}
//
//	public EntityPlayer getOwner() {
//		return pixelmon.getOwner();
//	}
//
//	public void setOwner(EntityPlayer player) {
//		pixelmon.setOwner(player);
//	}
//
//	public Vec3 getPosition() {
//		if (pixelmon instanceof EntityPixelmon) {
//			EntityPixelmon p = (EntityPixelmon) pixelmon;
//			return Vec3.createVectorHelper(p.posX, p.posY, p.posZ);
//		} else if (pixelmon instanceof EntityWaterPixelmon) {
//			EntityWaterPixelmon p = (EntityWaterPixelmon) pixelmon;
//			return Vec3.createVectorHelper(p.posX, p.posY, p.posZ);
//		}
//		return null;
//	}
//
//	public void setPosition(Vec3 pos) {
//		if (pixelmon instanceof EntityPixelmon) {
//			EntityPixelmon p = (EntityPixelmon) pixelmon;
//			p.posX = pos.xCoord;
//			p.posY = pos.yCoord;
//			p.posZ = pos.zCoord;
//		} else if (pixelmon instanceof EntityWaterPixelmon) {
//			EntityWaterPixelmon p = (EntityWaterPixelmon) pixelmon;
//			p.posX = pos.xCoord;
//			p.posY = pos.yCoord;
//			p.posZ = pos.zCoord;
//		}
//	}
//
//	public void setIsShiny(boolean isShiny) {
//		if (pixelmon instanceof EntityPixelmon)
//			((EntityPixelmon) pixelmon).setIsShiny(isShiny);
//		else if (pixelmon instanceof EntityWaterPixelmon)
//			((EntityWaterPixelmon) pixelmon).setIsShiny(isShiny);
//	}
//
//	public boolean getIsShiny() {
//		if (pixelmon instanceof EntityPixelmon)
//			return ((EntityPixelmon) pixelmon).getIsShiny();
//		else if (pixelmon instanceof EntityWaterPixelmon)
//			return ((EntityWaterPixelmon) pixelmon).getIsShiny();
//		return false;
//	}
//
//	public void setIsDead(boolean b) {
//		if (pixelmon instanceof EntityPixelmon) {
//			((EntityPixelmon) pixelmon).isDead = b;
//			if (!b)
//				((EntityPixelmon) pixelmon).deathTime = 0;
//		}
//		if (pixelmon instanceof EntityWaterPixelmon) {
//			((EntityWaterPixelmon) pixelmon).isDead = b;
//			if (!b)
//				((EntityWaterPixelmon) pixelmon).deathTime = 0;
//		}
//	}
//
//	public void clearVelocity() {
//		if (pixelmon instanceof EntityPixelmon) {
//			((EntityPixelmon) pixelmon).fallDistance = 0;
//		}
//		if (pixelmon instanceof EntityWaterPixelmon) {
//			((EntityWaterPixelmon) pixelmon).fallDistance = 0;
//		}
//	}
//
//
//	private String getLvlString() {
//		if (pixelmon instanceof EntityPixelmon)
//			return ((EntityPixelmon) pixelmon).getLvlString();
//		if (pixelmon instanceof EntityWaterPixelmon)
//			return ((EntityWaterPixelmon) pixelmon).getLvlString();
//		return null;
//	}
//
//	public void onUpdate() {
//		if (bc != null && wasBattleInitiator)
//			bc.update();
//	}
//
//	public void calculateAggression(Random random) {
//		int r = random.nextInt(100) + 1;
//		if (stats.BaseStats.aggression == null) {
//			aggression = Aggression.passive;
//			return;
//		}
//		if (r < stats.BaseStats.aggression.timid)
//			aggression = Aggression.timid;
//		else if (r < stats.BaseStats.aggression.timid + stats.BaseStats.aggression.passive)
//			aggression = Aggression.passive;
//		else if (r < stats.BaseStats.aggression.timid + stats.BaseStats.aggression.passive + stats.BaseStats.aggression.aggressive)
//			aggression = Aggression.aggressive;
//	}
//}
