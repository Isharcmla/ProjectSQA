package org.jsoup.nodes;

import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;
import java.lang.reflect.InvocationTargetException;

public class ReflectionUtils {
    public static final Unsafe UNSAFE;

    static {
        try {
            final Field uns = Unsafe.class.getDeclaredField("theUnsafe");
            uns.setAccessible(true);
            UNSAFE = (Unsafe) uns.get(null);
        }
        catch (Throwable e) {
            throw new RuntimeException();
        }

    }

    public static Field getModifiersField() throws Throwable {
        return Field.class.getDeclaredField("modifiers");
    }

    public static Object newInstance(Class<?> klass) throws Throwable {
        Object instance = klass.cast(UNSAFE.allocateInstance(klass));
        return instance;
    }

    public static Object newInstance(String klass) throws Throwable {
        Class<?> reflect = Class.forName(klass);
        return newInstance(reflect);
    }

    public static Object newArray(String elementType, int length) throws Throwable {
        Class<?> reflect = Class.forName(elementType);
        return Array.newInstance(reflect, length);
    }

    public static Object newObjectArray(Class<?> elementType, int length) throws Throwable {
        return Array.newInstance(elementType, length);
    }

    public static Object newBooleanArray(int length) throws Throwable {
        return Array.newInstance(boolean.class, length);
    }

    public static Object newByteArray(int length) throws Throwable {
        return Array.newInstance(byte.class, length);
    }

    public static Object newCharArray(int length) throws Throwable {
        return Array.newInstance(char.class, length);
    }

    public static Object newShortArray(int length) throws Throwable {
        return Array.newInstance(short.class, length);
    }

    public static Object newIntArray(int length) throws Throwable {
        return Array.newInstance(int.class, length);
    }

    public static Object newLongArray(int length) throws Throwable {
        return Array.newInstance(long.class, length);
    }

    public static Object newDoubleArray(int length) throws Throwable {
        return Array.newInstance(double.class, length);
    }

    public static Object newFloatArray(int length) throws Throwable {
        return Array.newInstance(float.class, length);
    }

    public static Field accessField(Class<?> klass, String name) throws Throwable {
        Field result = null;
        Class<?> current = klass;
        do {
            try {
                result = current.getDeclaredField(name);
            }
            catch (Throwable e) {
            }

            current = current.getSuperclass();
        } while (current != null && result == null);

        if (result == null) {
            throw new NoSuchFieldException();
        }

        return result;
    }

    public static Object getField(Object instance, Class<?> klass, String name) throws Throwable {
        Field field = accessField(klass, name);
        Field mods = getModifiersField();
        mods.setAccessible(true);
        int modifiers = mods.getInt(field);
        mods.setInt(field, modifiers & ~Modifier.FINAL);
        field.setAccessible(true);
        return field.get(instance);
    }

    public static void setField(Object instance, Class<?> klass, String name, Object value) throws Throwable {
        Field field = accessField(klass, name);
        Field mods = getModifiersField();
        mods.setAccessible(true);
        int modifiers = mods.getInt(field);
        mods.setInt(field, modifiers & ~Modifier.FINAL);
        field.setAccessible(true);
        field.set(instance, value);
    }

    public static void setBooleanField(Object instance, Class<?> klass, String name, boolean value) throws Throwable {
        Field field = accessField(klass, name);
        Field mods = getModifiersField();
        mods.setAccessible(true);
        int modifiers = mods.getInt(field);
        mods.setInt(field, modifiers & ~Modifier.FINAL);
        field.setAccessible(true);
        field.setBoolean(instance, value);
    }

    public static boolean getBooleanField(Object instance, Class<?> klass, String name) throws Throwable {
        Field field = accessField(klass, name);
        Field mods = getModifiersField();
        mods.setAccessible(true);
        int modifiers = mods.getInt(field);
        mods.setInt(field, modifiers & ~Modifier.FINAL);
        field.setAccessible(true);
        return field.getBoolean(instance);
    }

    public static void setByteField(Object instance, Class<?> klass, String name, byte value) throws Throwable {
        Field field = accessField(klass, name);
        Field mods = getModifiersField();
        mods.setAccessible(true);
        int modifiers = mods.getInt(field);
        mods.setInt(field, modifiers & ~Modifier.FINAL);
        field.setAccessible(true);
        field.setByte(instance, value);
    }

    public static byte getByteField(Object instance, Class<?> klass, String name) throws Throwable {
        Field field = accessField(klass, name);
        Field mods = getModifiersField();
        mods.setAccessible(true);
        int modifiers = mods.getInt(field);
        mods.setInt(field, modifiers & ~Modifier.FINAL);
        field.setAccessible(true);
        return field.getByte(instance);
    }

    public static void setCharField(Object instance, Class<?> klass, String name, char value) throws Throwable {
        Field field = accessField(klass, name);
        Field mods = getModifiersField();
        mods.setAccessible(true);
        int modifiers = mods.getInt(field);
        mods.setInt(field, modifiers & ~Modifier.FINAL);
        field.setAccessible(true);
        field.setChar(instance, value);
    }

    public static char getCharField(Object instance, Class<?> klass, String name) throws Throwable {
        Field field = accessField(klass, name);
        Field mods = getModifiersField();
        mods.setAccessible(true);
        int modifiers = mods.getInt(field);
        mods.setInt(field, modifiers & ~Modifier.FINAL);
        field.setAccessible(true);
        return field.getChar(instance);
    }

    public static void setShortField(Object instance, Class<?> klass, String name, short value) throws Throwable {
        Field field = accessField(klass, name);
        Field mods = getModifiersField();
        mods.setAccessible(true);
        int modifiers = mods.getInt(field);
        mods.setInt(field, modifiers & ~Modifier.FINAL);
        field.setAccessible(true);
        field.setShort(instance, value);
    }

    public static short getShortField(Object instance, Class<?> klass, String name) throws Throwable {
        Field field = accessField(klass, name);
        Field mods = getModifiersField();
        mods.setAccessible(true);
        int modifiers = mods.getInt(field);
        mods.setInt(field, modifiers & ~Modifier.FINAL);
        field.setAccessible(true);
        return field.getShort(instance);
    }

    public static void setIntField(Object instance, Class<?> klass, String name, int value) throws Throwable {
        Field field = accessField(klass, name);
        Field mods = getModifiersField();
        mods.setAccessible(true);
        int modifiers = mods.getInt(field);
        mods.setInt(field, modifiers & ~Modifier.FINAL);
        field.setAccessible(true);
        field.setInt(instance, value);
    }

    public static int getIntField(Object instance, Class<?> klass, String name) throws Throwable {
        Field field = accessField(klass, name);
        Field mods = getModifiersField();
        mods.setAccessible(true);
        int modifiers = mods.getInt(field);
        mods.setInt(field, modifiers & ~Modifier.FINAL);
        field.setAccessible(true);
        return field.getInt(instance);
    }

    public static void setLongField(Object instance, Class<?> klass, String name, long value) throws Throwable {
        Field field = accessField(klass, name);
        Field mods = getModifiersField();
        mods.setAccessible(true);
        int modifiers = mods.getInt(field);
        mods.setInt(field, modifiers & ~Modifier.FINAL);
        field.setAccessible(true);
        field.setLong(instance, value);
    }

    public static long getLongField(Object instance, Class<?> klass, String name) throws Throwable {
        Field field = accessField(klass, name);
        Field mods = getModifiersField();
        mods.setAccessible(true);
        int modifiers = mods.getInt(field);
        mods.setInt(field, modifiers & ~Modifier.FINAL);
        field.setAccessible(true);
        return field.getLong(instance);
    }

    public static void setDoubleField(Object instance, Class<?> klass, String name, double value) throws Throwable {
        Field field = accessField(klass, name);
        Field mods = getModifiersField();
        mods.setAccessible(true);
        int modifiers = mods.getInt(field);
        mods.setInt(field, modifiers & ~Modifier.FINAL);
        field.setAccessible(true);
        field.setDouble(instance, value);
    }

    public static double getDoubleField(Object instance, Class<?> klass, String name) throws Throwable {
        Field field = accessField(klass, name);
        Field mods = getModifiersField();
        mods.setAccessible(true);
        int modifiers = mods.getInt(field);
        mods.setInt(field, modifiers & ~Modifier.FINAL);
        field.setAccessible(true);
        return field.getDouble(instance);
    }

    public static void setFloatField(Object instance, Class<?> klass, String name, float value) throws Throwable {
        Field field = accessField(klass, name);
        Field mods = getModifiersField();
        mods.setAccessible(true);
        int modifiers = mods.getInt(field);
        mods.setInt(field, modifiers & ~Modifier.FINAL);
        field.setAccessible(true);
        field.setFloat(instance, value);
    }

    public static float getFloatField(Object instance, Class<?> klass, String name) throws Throwable {
        Field field = accessField(klass, name);
        Field mods = getModifiersField();
        mods.setAccessible(true);
        int modifiers = mods.getInt(field);
        mods.setInt(field, modifiers & ~Modifier.FINAL);
        field.setAccessible(true);
        return field.getFloat(instance);
    }

    public static void setElement(Object array, int index, Object element) throws Throwable {
        Array.set(array, index, element);
    }

    public static void setBooleanElement(Object array, int index, boolean element) throws Throwable {
        Array.setBoolean(array, index, element);
    }

    public static void setByteElement(Object array, int index, byte element) throws Throwable {
        Array.setByte(array, index, element);
    }

    public static void setCharElement(Object array, int index, char element) throws Throwable {
        Array.setChar(array, index, element);
    }

    public static void setShortElement(Object array, int index, short element) throws Throwable {
        Array.setShort(array, index, element);
    }

    public static void setIntElement(Object array, int index, int element) throws Throwable {
        Array.setInt(array, index, element);
    }

    public static void setLongElement(Object array, int index, long element) throws Throwable {
        Array.setLong(array, index, element);
    }

    public static void setDoubleElement(Object array, int index, double element) throws Throwable {
        Array.setDouble(array, index, element);
    }

    public static void setFloatElement(Object array, int index, float element) throws Throwable {
        Array.setFloat(array, index, element);
    }

    public static Object callConstructor(Class<?> klass, Class<?>[] argTypes, Object[] args) throws Throwable {
        Constructor<?> method = klass.getDeclaredConstructor(argTypes);
        method.setAccessible(true);
        return method.newInstance(args);
    }

    public static Object callMethod(Class<?> klass, String name, Class<?>[] argTypes, Object instance, Object[] args) throws Throwable {
        try {
            Method method = klass.getDeclaredMethod(name, argTypes);
            method.setAccessible(true);
            return method.invoke(instance, args);
        }
        catch (InvocationTargetException e) {
            throw e.getCause();
        }

    }

};


