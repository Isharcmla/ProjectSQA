package com.google.gson.stream;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.gson.stream.EqualityUtils.*;
import java.lang.Object;
import java.lang.Character;

public class JsonReader_isLiteral_144495788051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1783;
     Object term1900;
     Object term9549;

    public JsonReader_isLiteral_144495788051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1783 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term1785 = (char[]) newCharArray(8);
        int[] term1813 = (int[]) newIntArray(3);
        Object[] term1818 = (Object[]) newArray("java.lang.String", 6);
        int[] term1891 = (int[]) newIntArray(8);
        setField(term1783, term1783.getClass(), "in", null);
        setBooleanField(term1783, term1783.getClass(), "lenient", false);
        setCharElement(term1785, 0, 'Z');
        setCharElement(term1785, 1, 'p');
        setCharElement(term1785, 2, 'V');
        setCharElement(term1785, 3, 'm');
        setCharElement(term1785, 4, 'a');
        setCharElement(term1785, 5, 'n');
        setCharElement(term1785, 6, 'W');
        setCharElement(term1785, 7, 'E');
        setField(term1783, term1783.getClass(), "buffer", term1785);
        setIntField(term1783, term1783.getClass(), "pos", 114754804);
        setIntField(term1783, term1783.getClass(), "limit", 1687361082);
        setIntField(term1783, term1783.getClass(), "lineNumber", 584893196);
        setIntField(term1783, term1783.getClass(), "lineStart", 497269071);
        setIntField(term1783, term1783.getClass(), "peeked", -1899301124);
        setLongField(term1783, term1783.getClass(), "peekedLong", -8885298608300233488L);
        setIntField(term1783, term1783.getClass(), "peekedNumberLength", -1882480155);
        setField(term1783, term1783.getClass(), "peekedString", "hoicvmsovO");
        setIntElement(term1813, 0, -1410220680);
        setIntElement(term1813, 1, 389427431);
        setIntElement(term1813, 2, -1945706126);
        setField(term1783, term1783.getClass(), "stack", term1813);
        setIntField(term1783, term1783.getClass(), "stackSize", 1152356969);
        setElement(term1818, 0, "eqJfYWRaEL");
        setElement(term1818, 1, "fhkbdRViHi");
        setElement(term1818, 2, "uWHnvSvaPl");
        setElement(term1818, 3, "kBdSllIBVz");
        setElement(term1818, 4, "TJmVBGfTML");
        setElement(term1818, 5, "tPlsykYBqO");
        setField(term1783, term1783.getClass(), "pathNames", term1818);
        setIntElement(term1891, 0, -1667990367);
        setIntElement(term1891, 1, -1214628358);
        setIntElement(term1891, 2, 1102721075);
        setIntElement(term1891, 3, -426764678);
        setIntElement(term1891, 4, -1222614956);
        setIntElement(term1891, 5, -1870495012);
        setIntElement(term1891, 6, -1310015129);
        setIntElement(term1891, 7, -2104981311);
        setField(term1783, term1783.getClass(), "pathIndices", term1891);
        term1900 = new Character('G');
        term9549 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term9550 = (char[]) newCharArray(8);
        int[] term9553 = (int[]) newIntArray(3);
        Object[] term9554 = (Object[]) newArray("java.lang.String", 6);
        int[] term9567 = (int[]) newIntArray(8);
        setField(term9549, term9549.getClass(), "in", null);
        setBooleanField(term9549, term9549.getClass(), "lenient", false);
        setCharElement(term9550, 0, 'Z');
        setCharElement(term9550, 1, 'p');
        setCharElement(term9550, 2, 'V');
        setCharElement(term9550, 3, 'm');
        setCharElement(term9550, 4, 'a');
        setCharElement(term9550, 5, 'n');
        setCharElement(term9550, 6, 'W');
        setCharElement(term9550, 7, 'E');
        setField(term9549, term9549.getClass(), "buffer", term9550);
        setIntField(term9549, term9549.getClass(), "pos", 114754804);
        setIntField(term9549, term9549.getClass(), "limit", 1687361082);
        setIntField(term9549, term9549.getClass(), "lineNumber", 584893196);
        setIntField(term9549, term9549.getClass(), "lineStart", 497269071);
        setIntField(term9549, term9549.getClass(), "peeked", -1899301124);
        setLongField(term9549, term9549.getClass(), "peekedLong", -8885298608300233488L);
        setIntField(term9549, term9549.getClass(), "peekedNumberLength", -1882480155);
        setField(term9549, term9549.getClass(), "peekedString", "hoicvmsovO");
        setIntElement(term9553, 0, -1410220680);
        setIntElement(term9553, 1, 389427431);
        setIntElement(term9553, 2, -1945706126);
        setField(term9549, term9549.getClass(), "stack", term9553);
        setIntField(term9549, term9549.getClass(), "stackSize", 1152356969);
        setElement(term9554, 0, "eqJfYWRaEL");
        setElement(term9554, 1, "fhkbdRViHi");
        setElement(term9554, 2, "uWHnvSvaPl");
        setElement(term9554, 3, "kBdSllIBVz");
        setElement(term9554, 4, "TJmVBGfTML");
        setElement(term9554, 5, "tPlsykYBqO");
        setField(term9549, term9549.getClass(), "pathNames", term9554);
        setIntElement(term9567, 0, -1667990367);
        setIntElement(term9567, 1, -1214628358);
        setIntElement(term9567, 2, 1102721075);
        setIntElement(term9567, 3, -426764678);
        setIntElement(term9567, 4, -1222614956);
        setIntElement(term9567, 5, -1870495012);
        setIntElement(term9567, 6, -1310015129);
        setIntElement(term9567, 7, -2104981311);
        setField(term9549, term9549.getClass(), "pathIndices", term9567);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term1900;
        Object retValue = callMethod(klass, "isLiteral", argTypes, term1783, args);
        assertTrue(recursiveEquals(term1783, term9549));
        assertTrue(recursiveEquals(term1900, 'G'));
        assertTrue(recursiveEquals(retValue, true));
    }

};


