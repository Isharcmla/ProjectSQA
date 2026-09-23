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
import com.google.gson.stream.MalformedJsonException;
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JsonReader_syntaxError_82493016076 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5453;

    public JsonReader_syntaxError_82493016076() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5453 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term5455 = (char[]) newCharArray(8);
        int[] term5483 = (int[]) newIntArray(5);
        Object[] term5490 = (Object[]) newArray("java.lang.String", 6);
        int[] term5563 = (int[]) newIntArray(6);
        setField(term5453, term5453.getClass(), "in", null);
        setBooleanField(term5453, term5453.getClass(), "lenient", true);
        setCharElement(term5455, 0, 'G');
        setCharElement(term5455, 1, 'I');
        setCharElement(term5455, 2, 'b');
        setCharElement(term5455, 3, 'n');
        setCharElement(term5455, 4, 'z');
        setCharElement(term5455, 5, 'T');
        setCharElement(term5455, 6, 's');
        setCharElement(term5455, 7, 't');
        setField(term5453, term5453.getClass(), "buffer", term5455);
        setIntField(term5453, term5453.getClass(), "pos", 1163761623);
        setIntField(term5453, term5453.getClass(), "limit", 718742281);
        setIntField(term5453, term5453.getClass(), "lineNumber", 1532723756);
        setIntField(term5453, term5453.getClass(), "lineStart", -124088550);
        setIntField(term5453, term5453.getClass(), "peeked", 777492093);
        setLongField(term5453, term5453.getClass(), "peekedLong", 6617340557564669657L);
        setIntField(term5453, term5453.getClass(), "peekedNumberLength", 1414025609);
        setField(term5453, term5453.getClass(), "peekedString", "kVEZMHmRtR");
        setIntElement(term5483, 0, 255145822);
        setIntElement(term5483, 1, -573608449);
        setIntElement(term5483, 2, -1660057757);
        setIntElement(term5483, 3, 1816273440);
        setIntElement(term5483, 4, -96541009);
        setField(term5453, term5453.getClass(), "stack", term5483);
        setIntField(term5453, term5453.getClass(), "stackSize", -43719302);
        setElement(term5490, 0, "ekxGuOYIwi");
        setElement(term5490, 1, "RbVQXSpxXy");
        setElement(term5490, 2, "YpJbIgJWWv");
        setElement(term5490, 3, "JppkknKVOw");
        setElement(term5490, 4, "iljANwuEjk");
        setElement(term5490, 5, "kNqaJKIATy");
        setField(term5453, term5453.getClass(), "pathNames", term5490);
        setIntElement(term5563, 0, 1024134939);
        setIntElement(term5563, 1, 109078154);
        setIntElement(term5563, 2, -314165467);
        setIntElement(term5563, 3, 963694071);
        setIntElement(term5563, 4, -995785731);
        setIntElement(term5563, 5, 1349815364);
        setField(term5453, term5453.getClass(), "pathIndices", term5563);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vKQukfbJUd";
        try {
            callMethod(klass, "syntaxError", argTypes, term5453, args);
            assertTrue(false);
        }
        catch (MalformedJsonException e) {
        }

    }

};


