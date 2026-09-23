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

public class JsonReader_nextDouble_141140331856 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2727;

    public JsonReader_nextDouble_141140331856() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2727 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term2729 = (char[]) newCharArray(6);
        int[] term2755 = (int[]) newIntArray(6);
        Object[] term2763 = (Object[]) newArray("java.lang.String", 0);
        int[] term2764 = (int[]) newIntArray(6);
        setField(term2727, term2727.getClass(), "in", null);
        setBooleanField(term2727, term2727.getClass(), "lenient", true);
        setCharElement(term2729, 0, 'K');
        setCharElement(term2729, 1, 'T');
        setCharElement(term2729, 2, 'N');
        setCharElement(term2729, 3, 'F');
        setCharElement(term2729, 4, 'h');
        setCharElement(term2729, 5, 'R');
        setField(term2727, term2727.getClass(), "buffer", term2729);
        setIntField(term2727, term2727.getClass(), "pos", -919416536);
        setIntField(term2727, term2727.getClass(), "limit", -43417861);
        setIntField(term2727, term2727.getClass(), "lineNumber", -1533843432);
        setIntField(term2727, term2727.getClass(), "lineStart", -123338791);
        setIntField(term2727, term2727.getClass(), "peeked", -1467089634);
        setLongField(term2727, term2727.getClass(), "peekedLong", -316468845751588286L);
        setIntField(term2727, term2727.getClass(), "peekedNumberLength", 413548937);
        setField(term2727, term2727.getClass(), "peekedString", "jiKYgYHqIS");
        setIntElement(term2755, 0, 1901317214);
        setIntElement(term2755, 1, 1166710220);
        setIntElement(term2755, 2, -1070592289);
        setIntElement(term2755, 3, -1464172784);
        setIntElement(term2755, 4, 32185364);
        setIntElement(term2755, 5, 1768204942);
        setField(term2727, term2727.getClass(), "stack", term2755);
        setIntField(term2727, term2727.getClass(), "stackSize", 1252951645);
        setField(term2727, term2727.getClass(), "pathNames", term2763);
        setIntElement(term2764, 0, 574481092);
        setIntElement(term2764, 1, -310528004);
        setIntElement(term2764, 2, -634976996);
        setIntElement(term2764, 3, -1015274146);
        setIntElement(term2764, 4, -49052672);
        setIntElement(term2764, 5, 339372704);
        setField(term2727, term2727.getClass(), "pathIndices", term2764);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextDouble", argTypes, term2727, args);
            assertTrue(false);
        }
        catch (AssertionError e) {
        }

    }

};


