package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.util.ArrayList;

public class CollapseProperties_flattenReferencesTo_1719791244177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97852;
     Object term97956;
     Object term98086;
     Object term98087;

    public CollapseProperties_flattenReferencesTo_1719791244177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97852 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        ArrayList term98008 = new ArrayList();
        ArrayList term98060 = new ArrayList();
        term97956 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term97956, term97956.getClass(), "refs", term98008);
        setField(term97956, term97956.getClass(), "parent", null);
        setField(term97956, term97956.getClass(), "name", null);
        setField(term97956, term97956.getClass(), "props", term98060);
        term98086 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term98086, term98086.getClass(), "compiler", null);
        setField(term98086, term98086.getClass(), "globalNames", null);
        setField(term98086, term98086.getClass(), "nameMap", null);
        setBooleanField(term98086, term98086.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term98086, term98086.getClass(), "inlineAliases", false);
        ArrayList term98088 = new ArrayList();
        ArrayList term98090 = new ArrayList();
        term98087 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term98087, term98087.getClass(), "name", null);
        setField(term98087, term98087.getClass(), "parent", null);
        setField(term98087, term98087.getClass(), "props", term98088);
        setField(term98087, term98087.getClass(), "declaration", null);
        setField(term98087, term98087.getClass(), "refs", term98090);
        setField(term98087, term98087.getClass(), "type", null);
        setBooleanField(term98087, term98087.getClass(), "isClassOrEnum", false);
        setBooleanField(term98087, term98087.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term98087, term98087.getClass(), "globalSets", 0);
        setIntField(term98087, term98087.getClass(), "localSets", 0);
        setIntField(term98087, term98087.getClass(), "aliasingGets", 0);
        setIntField(term98087, term98087.getClass(), "totalGets", 0);
        setIntField(term98087, term98087.getClass(), "callGets", 0);
        setBooleanField(term98087, term98087.getClass(), "inExterns", false);
        setField(term98087, term98087.getClass(), "docInfo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term97956;
        args[1] = null;
        callMethod(klass, "flattenReferencesTo", argTypes, term97852, args);
        assertTrue(recursiveEquals(term97852, term98086));
        assertTrue(recursiveEquals(term97956, term98087));
    }

};


