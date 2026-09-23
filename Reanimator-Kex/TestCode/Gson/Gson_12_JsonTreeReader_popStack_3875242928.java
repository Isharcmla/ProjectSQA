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

public class JsonTreeReader_popStack_3875242928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1738;

    public JsonTreeReader_popStack_3875242928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1738 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term1739 = (Object[]) newArray("java.lang.Object", 7);
        Object term1740 = newInstance(Class.forName("java.lang.Object"));
        Object term1741 = newInstance(Class.forName("java.lang.Object"));
        Object term1742 = newInstance(Class.forName("java.lang.Object"));
        Object term1743 = newInstance(Class.forName("java.lang.Object"));
        Object term1744 = newInstance(Class.forName("java.lang.Object"));
        Object term1745 = newInstance(Class.forName("java.lang.Object"));
        Object term1746 = newInstance(Class.forName("java.lang.Object"));
        Object[] term1820 = (Object[]) newArray("java.lang.String", 0);
        int[] term1821 = (int[]) newIntArray(2);
        char[] term1791 = (char[]) newCharArray(2);
        int[] term1813 = (int[]) newIntArray(5);
        setElement(term1739, 0, term1740);
        setElement(term1739, 1, term1741);
        setElement(term1739, 2, term1742);
        setElement(term1739, 3, term1743);
        setElement(term1739, 4, term1744);
        setElement(term1739, 5, term1745);
        setElement(term1739, 6, term1746);
        setField(term1738, term1738.getClass(), "stack", term1739);
        setIntField(term1738, term1738.getClass(), "stackSize", -2066804303);
        setField(term1738, term1738.getClass(), "pathNames", term1820);
        setIntElement(term1821, 0, -1731761810);
        setIntElement(term1821, 1, 197109649);
        setField(term1738, term1738.getClass(), "pathIndices", term1821);
        setField(term1738, term1738.getClass(), "in", null);
        setBooleanField(term1738, term1738.getClass(), "lenient", true);
        setCharElement(term1791, 0, 'H');
        setCharElement(term1791, 1, 'g');
        setField(term1738, term1738.getClass(), "buffer", term1791);
        setIntField(term1738, term1738.getClass(), "pos", -243422082);
        setIntField(term1738, term1738.getClass(), "limit", 1384592638);
        setIntField(term1738, term1738.getClass(), "lineNumber", -1002370457);
        setIntField(term1738, term1738.getClass(), "lineStart", -2014576105);
        setIntField(term1738, term1738.getClass(), "peeked", 1296895584);
        setLongField(term1738, term1738.getClass(), "peekedLong", 6811161968424632369L);
        setIntField(term1738, term1738.getClass(), "peekedNumberLength", 628918458);
        setField(term1738, term1738.getClass(), "peekedString", "wGmYcqUkgE");
        setIntElement(term1813, 0, -1274456137);
        setIntElement(term1813, 1, 1041916673);
        setIntElement(term1813, 2, -601863069);
        setIntElement(term1813, 3, 663292551);
        setIntElement(term1813, 4, -1885090354);
        setField(term1738, term1738.getClass(), "stack", term1813);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "popStack", argTypes, term1738, args);
    }

};


