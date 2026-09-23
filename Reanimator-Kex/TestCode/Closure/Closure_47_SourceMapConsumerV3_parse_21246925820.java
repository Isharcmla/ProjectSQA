package com.google.debugging.sourcemap;

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
import com.google.debugging.sourcemap.SourceMapParseException;
import static com.google.debugging.sourcemap.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class SourceMapConsumerV3_parse_21246925820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term574;
     Object term671;

    public SourceMapConsumerV3_parse_21246925820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term662 = new ArrayList();
        HashMap term666 = new HashMap();
        term574 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        Object[] term575 = (Object[]) newArray("java.lang.String", 1);
        Object[] term588 = (Object[]) newArray("java.lang.String", 6);
        setElement(term575, 0, "BYqFIqCKAV");
        setField(term574, term574.getClass(), "sources", term575);
        setElement(term588, 0, "vrQLuWIDJX");
        setElement(term588, 1, "flxyYxBRtu");
        setElement(term588, 2, "OclPbYPkcH");
        setElement(term588, 3, "IoAlmYsBwc");
        setElement(term588, 4, "TEParAifyi");
        setElement(term588, 5, "OWDIEULEFu");
        setField(term574, term574.getClass(), "names", term588);
        setIntField(term574, term574.getClass(), "lineCount", 391863371);
        setField(term574, term574.getClass(), "lines", term662);
        setField(term574, term574.getClass(), "reverseSourceMapping", term666);
        HashMap term672 = new HashMap();
        term671 = newInstance(Class.forName("org.json.JSONObject"));
        setField(term671, term671.getClass(), "map", term672);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.json.JSONObject");
        argTypes[1] = Class.forName("com.google.debugging.sourcemap.SourceMapSupplier");
        Object[] args = new Object[2];
        args[0] = term671;
        args[1] = null;
        try {
            callMethod(klass, "parse", argTypes, term574, args);
            assertTrue(false);
        }
        catch (SourceMapParseException e) {
        }

    }

};


