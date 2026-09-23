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
import java.lang.AssertionError;
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JsonReader_beginObject_106482902744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term549;

    public JsonReader_beginObject_106482902744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term549 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term551 = (char[]) newCharArray(0);
        int[] term571 = (int[]) newIntArray(2);
        Object[] term575 = (Object[]) newArray("java.lang.String", 8);
        int[] term672 = (int[]) newIntArray(6);
        setField(term549, term549.getClass(), "in", null);
        setBooleanField(term549, term549.getClass(), "lenient", true);
        setField(term549, term549.getClass(), "buffer", term551);
        setIntField(term549, term549.getClass(), "pos", -93135961);
        setIntField(term549, term549.getClass(), "limit", -112921587);
        setIntField(term549, term549.getClass(), "lineNumber", 933028652);
        setIntField(term549, term549.getClass(), "lineStart", 287287233);
        setIntField(term549, term549.getClass(), "peeked", 962840079);
        setLongField(term549, term549.getClass(), "peekedLong", 5270370404989704783L);
        setIntField(term549, term549.getClass(), "peekedNumberLength", 1540719661);
        setField(term549, term549.getClass(), "peekedString", "HyxfbSQYBe");
        setIntElement(term571, 0, 1265463001);
        setIntElement(term571, 1, 335112684);
        setField(term549, term549.getClass(), "stack", term571);
        setIntField(term549, term549.getClass(), "stackSize", 1551099402);
        setElement(term575, 0, "pCTimMblYc");
        setElement(term575, 1, "hNxWaHcfhY");
        setElement(term575, 2, "RkybSrpybU");
        setElement(term575, 3, "xOEqzGAmDU");
        setElement(term575, 4, "eZFUvlxvGV");
        setElement(term575, 5, "BYqFIqCKAV");
        setElement(term575, 6, "vrQLuWIDJX");
        setElement(term575, 7, "flxyYxBRtu");
        setField(term549, term549.getClass(), "pathNames", term575);
        setIntElement(term672, 0, -2027534003);
        setIntElement(term672, 1, 1063420942);
        setIntElement(term672, 2, 1375330971);
        setIntElement(term672, 3, -478195677);
        setIntElement(term672, 4, 972867650);
        setIntElement(term672, 5, 1655935355);
        setField(term549, term549.getClass(), "pathIndices", term672);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "beginObject", argTypes, term549, args);
            assertTrue(false);
        }
        catch (AssertionError e) {
        }

    }

};


