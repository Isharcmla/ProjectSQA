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

public class JsonReader_endObject_97745249544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term777;

    public JsonReader_endObject_97745249544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term777 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term779 = (char[]) newCharArray(2);
        int[] term801 = (int[]) newIntArray(1);
        Object[] term804 = (Object[]) newArray("java.lang.String", 9);
        int[] term913 = (int[]) newIntArray(3);
        setField(term777, term777.getClass(), "in", null);
        setBooleanField(term777, term777.getClass(), "lenient", true);
        setCharElement(term779, 0, 'r');
        setCharElement(term779, 1, 'b');
        setField(term777, term777.getClass(), "buffer", term779);
        setIntField(term777, term777.getClass(), "pos", -1465035361);
        setIntField(term777, term777.getClass(), "limit", 1090617576);
        setIntField(term777, term777.getClass(), "lineNumber", -1547384488);
        setIntField(term777, term777.getClass(), "lineStart", 1442160736);
        setIntField(term777, term777.getClass(), "peeked", 1114000454);
        setLongField(term777, term777.getClass(), "peekedLong", 7411271909051562686L);
        setIntField(term777, term777.getClass(), "peekedNumberLength", -556405712);
        setField(term777, term777.getClass(), "peekedString", "OclPbYPkcH");
        setIntElement(term801, 0, -1772434990);
        setField(term777, term777.getClass(), "stack", term801);
        setIntField(term777, term777.getClass(), "stackSize", -1845499264);
        setElement(term804, 0, "IoAlmYsBwc");
        setElement(term804, 1, "TEParAifyi");
        setElement(term804, 2, "OWDIEULEFu");
        setElement(term804, 3, "dWRymuLBtr");
        setElement(term804, 4, "AijpHYOFuy");
        setElement(term804, 5, "SbAoxhfrkn");
        setElement(term804, 6, "kuTXqwMtDB");
        setElement(term804, 7, "Ghbwtircqb");
        setElement(term804, 8, "xrwlQZdwCp");
        setField(term777, term777.getClass(), "pathNames", term804);
        setIntElement(term913, 0, -505439934);
        setIntElement(term913, 1, -344842608);
        setIntElement(term913, 2, 941650513);
        setField(term777, term777.getClass(), "pathIndices", term913);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "endObject", argTypes, term777, args);
            assertTrue(false);
        }
        catch (AssertionError e) {
        }

    }

};


