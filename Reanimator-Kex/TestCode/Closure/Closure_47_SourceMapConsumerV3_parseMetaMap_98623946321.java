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

public class SourceMapConsumerV3_parseMetaMap_98623946321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term747;
     Object term844;

    public SourceMapConsumerV3_parseMetaMap_98623946321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term835 = new ArrayList();
        HashMap term839 = new HashMap();
        term747 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        Object[] term748 = (Object[]) newArray("java.lang.String", 5);
        Object[] term809 = (Object[]) newArray("java.lang.String", 2);
        setElement(term748, 0, "dWRymuLBtr");
        setElement(term748, 1, "AijpHYOFuy");
        setElement(term748, 2, "SbAoxhfrkn");
        setElement(term748, 3, "kuTXqwMtDB");
        setElement(term748, 4, "Ghbwtircqb");
        setField(term747, term747.getClass(), "sources", term748);
        setElement(term809, 0, "xrwlQZdwCp");
        setElement(term809, 1, "IDCWpPLRkE");
        setField(term747, term747.getClass(), "names", term809);
        setIntField(term747, term747.getClass(), "lineCount", -1922583790);
        setField(term747, term747.getClass(), "lines", term835);
        setField(term747, term747.getClass(), "reverseSourceMapping", term839);
        HashMap term845 = new HashMap();
        term844 = newInstance(Class.forName("org.json.JSONObject"));
        setField(term844, term844.getClass(), "map", term845);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.json.JSONObject");
        argTypes[1] = Class.forName("com.google.debugging.sourcemap.SourceMapSupplier");
        Object[] args = new Object[2];
        args[0] = term844;
        args[1] = null;
        try {
            callMethod(klass, "parseMetaMap", argTypes, term747, args);
            assertTrue(false);
        }
        catch (SourceMapParseException e) {
        }

    }

};


