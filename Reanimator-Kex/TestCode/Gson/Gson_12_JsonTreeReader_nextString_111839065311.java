package com.google.gson.internal.bind;

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
import static com.google.gson.internal.bind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JsonTreeReader_nextString_111839065311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2690;

    public JsonTreeReader_nextString_111839065311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2690 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term2691 = (Object[]) newArray("java.lang.Object", 0);
        Object[] term2800 = (Object[]) newArray("java.lang.String", 1);
        int[] term2813 = (int[]) newIntArray(1);
        char[] term2773 = (char[]) newCharArray(1);
        int[] term2794 = (int[]) newIntArray(4);
        setField(term2690, term2690.getClass(), "stack", term2691);
        setIntField(term2690, term2690.getClass(), "stackSize", -282881827);
        setElement(term2800, 0, "fztQhjqwdP");
        setField(term2690, term2690.getClass(), "pathNames", term2800);
        setIntElement(term2813, 0, -1183353915);
        setField(term2690, term2690.getClass(), "pathIndices", term2813);
        setField(term2690, term2690.getClass(), "in", null);
        setBooleanField(term2690, term2690.getClass(), "lenient", false);
        setCharElement(term2773, 0, 'w');
        setField(term2690, term2690.getClass(), "buffer", term2773);
        setIntField(term2690, term2690.getClass(), "pos", -209654048);
        setIntField(term2690, term2690.getClass(), "limit", 477625804);
        setIntField(term2690, term2690.getClass(), "lineNumber", 252575029);
        setIntField(term2690, term2690.getClass(), "lineStart", 57189932);
        setIntField(term2690, term2690.getClass(), "peeked", 1460722225);
        setLongField(term2690, term2690.getClass(), "peekedLong", -2813493605142626659L);
        setIntField(term2690, term2690.getClass(), "peekedNumberLength", 1743224434);
        setField(term2690, term2690.getClass(), "peekedString", "ZVecLZMLHF");
        setIntElement(term2794, 0, 842904495);
        setIntElement(term2794, 1, 1008080511);
        setIntElement(term2794, 2, 1935707624);
        setIntElement(term2794, 3, 1507074215);
        setField(term2690, term2690.getClass(), "stack", term2794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextString", argTypes, term2690, args);
    }

};


