package com.sangam1.InventoryRepair.Events.Client;

import java.util.ArrayList;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

public class Armor_Durability {
	
	public static Minecraft mc = Minecraft.getInstance();
	public static PlayerEntity player = mc.player;
	public static Iterable<ItemStack> armor = player.getArmorInventoryList();
	
	private static String head;
	private static ItemStack head_icon;
	private static String head_durability;
	
	private static String body;
	private static ItemStack body_icon;
	private static String body_durability;
	
	private static String leg;
	private static ItemStack leg_icon;
	private static String leg_durability;
	
	private static String boot;
	private static ItemStack boot_icon;
	private static String boot_durability;
	
	private static String hand;
	private static ItemStack hand_icon;
	private static String hand_durability;
	
	//ALL COMMON
	private static String durability(ItemStack stack) {
		int current = stack.getMaxDamage() - stack.getDamage();
		return " " + current + " / " + stack.getMaxDamage();
	}
	
	
	//HEAD
	public static String getHead() {
		ArrayList <ItemStack> a = new ArrayList<ItemStack>();
		for (ItemStack b:armor) {
			a.add(b);
		}
		head_icon = a.get(3);
		head = head_icon.getDisplayName().getFormattedText();
		head_durability = durability (head_icon);
		return head;
	}
	
	public static ItemStack getHead_Icon() {
		return head_icon;
	}
	
	public static String getHead_Durability() {
		return head_durability;
	}
	
	//BODY
	public static String getBody() {
		ArrayList <ItemStack> a = new ArrayList<ItemStack>();
		for (ItemStack b:armor) {
			a.add(b);
		}
		body_icon = a.get(2);
		body = body_icon.getDisplayName().getFormattedText();
		body_durability = durability (body_icon);
		return body;
	}
	
	public static ItemStack getBody_Icon() {
		return body_icon;
	}
	
	public static String getBody_Durability() {
		return body_durability;
	}
	
	//LEG
	public static String getLeg() {
		ArrayList <ItemStack> a = new ArrayList<ItemStack>();
		for (ItemStack b:armor) {
			a.add(b);
		}
		leg_icon = a.get(1);
		leg = leg_icon.getDisplayName().getFormattedText();
		leg_durability = durability (leg_icon);
		return leg;
	}
	
	public static ItemStack getLeg_Icon() {
		return leg_icon;
	}
	
	public static String getLeg_Durability() {
		return leg_durability;
	}
	
	//BOOT
	public static String getBoot() {
		ArrayList <ItemStack> a = new ArrayList<ItemStack>();
		for (ItemStack b:armor) {
			a.add(b);
		}
		boot_icon = a.get(0);
		boot = boot_icon.getDisplayName().getFormattedText();
		boot_durability = durability (boot_icon);
		return boot;
	}
	
	public static ItemStack getBoot_Icon() {
		return boot_icon;
	}
	
	public static String getBoot_Durability() {
		return boot_durability;
	}
	
	//HAND
	public static String getHand() {
		if (player.getHeldItemMainhand() != null) {
			hand_icon = player.getHeldItemMainhand();
			hand = hand_icon.getDisplayName().getFormattedText();
			hand_durability = durability (hand_icon);
		} else {
			hand_icon = null;
			hand = " ";
			hand_durability = " ";
		}
		return hand;
	}
	
	public static ItemStack getHand_Icon() {
		return hand_icon;
	}
	
	public static String getHand_Durability() {
		if (hand_icon.getMaxDamage() == 0)
			hand_durability = " ";
		return hand_durability;
	}
}
