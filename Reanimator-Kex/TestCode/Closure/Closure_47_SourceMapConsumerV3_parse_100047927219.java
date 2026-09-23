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

public class SourceMapConsumerV3_parse_100047927219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term379;
     Object term488;

    public SourceMapConsumerV3_parse_100047927219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term479 = new ArrayList();
        HashMap term483 = new HashMap();
        term379 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        Object[] term380 = (Object[]) newArray("java.lang.String", 2);
        Object[] term405 = (Object[]) newArray("java.lang.String", 6);
        setElement(term380, 0, "ZiaGIbnzTs");
        setElement(term380, 1, "tbcdzjIfER");
        setField(term379, term379.getClass(), "sources", term380);
        setElement(term405, 0, "HyxfbSQYBe");
        setElement(term405, 1, "pCTimMblYc");
        setElement(term405, 2, "hNxWaHcfhY");
        setElement(term405, 3, "RkybSrpybU");
        setElement(term405, 4, "xOEqzGAmDU");
        setElement(term405, 5, "eZFUvlxvGV");
        setField(term379, term379.getClass(), "names", term405);
        setIntField(term379, term379.getClass(), "lineCount", 1484323161);
        setField(term379, term379.getClass(), "lines", term479);
        setField(term379, term379.getClass(), "reverseSourceMapping", term483);
        HashMap term489 = new HashMap();
        term488 = newInstance(Class.forName("org.json.JSONObject"));
        setField(term488, term488.getClass(), "map", term489);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.json.JSONObject");
        Object[] args = new Object[1];
        args[0] = term488;
        try {
            callMethod(klass, "parse", argTypes, term379, args);
            assertTrue(false);
        }
        catch (SourceMapParseException e) {
        }

    }

};


