package org.apache.commons.collections;

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
import static org.apache.commons.collections.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;

public class ExtendedProperties_getKeys_406677329549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142607;
     Object term143059;
     Object term143051;

    public ExtendedProperties_getKeys_406677329549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term142697 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term142659 = new ArrayList();
        ((ArrayList) term142659).add(term142697);
        ((ArrayList) term142659).add((Object)null);
        ((ArrayList) term142659).add((Object)null);
        ((ArrayList) term142659).add((Object)null);
        ((ArrayList) term142659).add((Object)null);
        ((ArrayList) term142659).add((Object)null);
        ((ArrayList) term142659).add((Object)null);
        ((ArrayList) term142659).add((Object)null);
        ((ArrayList) term142659).add((Object)null);
        ((ArrayList) term142659).add((Object)null);
        ((ArrayList) term142659).add((Object)null);
        ((ArrayList) term142659).add((Object)null);
        ((ArrayList) term142659).add((Object)null);
        ((ArrayList) term142659).add((Object)null);
        ((ArrayList) term142659).add((Object)null);
        ((ArrayList) term142659).add((Object)null);
        ((ArrayList) term142659).add((Object)null);
        ((ArrayList) term142659).add((Object)null);
        ((ArrayList) term142659).add((Object)null);
        ((ArrayList) term142659).add((Object)null);
        ((ArrayList) term142659).add((Object)null);
        ((ArrayList) term142659).add((Object)null);
        ((ArrayList) term142659).add((Object)null);
        ((ArrayList) term142659).add((Object)null);
        ((ArrayList) term142659).add((Object)null);
        ((ArrayList) term142659).add((Object)null);
        ((ArrayList) term142659).add((Object)null);
        ((ArrayList) term142659).add((Object)null);
        ((ArrayList) term142659).add((Object)null);
        ((ArrayList) term142659).add((Object)null);
        ((ArrayList) term142659).add((Object)null);
        ((ArrayList) term142659).add((Object)null);
        ((ArrayList) term142659).add((Object)null);
        ((ArrayList) term142659).add((Object)null);
        ((ArrayList) term142659).add((Object)null);
        ((ArrayList) term142659).add((Object)null);
        ((ArrayList) term142659).add((Object)null);
        ((ArrayList) term142659).add((Object)null);
        ((ArrayList) term142659).add((Object)null);
        ((ArrayList) term142659).add((Object)null);
        ((ArrayList) term142659).add((Object)null);
        term142607 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term142607, term142607.getClass(), "keysAsListed", term142659);
        Object term143062 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term143060 = new ArrayList();
        ((ArrayList) term143060).add(term143062);
        ((ArrayList) term143060).add((Object)null);
        ((ArrayList) term143060).add((Object)null);
        ((ArrayList) term143060).add((Object)null);
        ((ArrayList) term143060).add((Object)null);
        ((ArrayList) term143060).add((Object)null);
        ((ArrayList) term143060).add((Object)null);
        ((ArrayList) term143060).add((Object)null);
        ((ArrayList) term143060).add((Object)null);
        ((ArrayList) term143060).add((Object)null);
        ((ArrayList) term143060).add((Object)null);
        ((ArrayList) term143060).add((Object)null);
        ((ArrayList) term143060).add((Object)null);
        ((ArrayList) term143060).add((Object)null);
        ((ArrayList) term143060).add((Object)null);
        ((ArrayList) term143060).add((Object)null);
        ((ArrayList) term143060).add((Object)null);
        ((ArrayList) term143060).add((Object)null);
        ((ArrayList) term143060).add((Object)null);
        ((ArrayList) term143060).add((Object)null);
        ((ArrayList) term143060).add((Object)null);
        ((ArrayList) term143060).add((Object)null);
        ((ArrayList) term143060).add((Object)null);
        ((ArrayList) term143060).add((Object)null);
        ((ArrayList) term143060).add((Object)null);
        ((ArrayList) term143060).add((Object)null);
        ((ArrayList) term143060).add((Object)null);
        ((ArrayList) term143060).add((Object)null);
        ((ArrayList) term143060).add((Object)null);
        ((ArrayList) term143060).add((Object)null);
        ((ArrayList) term143060).add((Object)null);
        ((ArrayList) term143060).add((Object)null);
        ((ArrayList) term143060).add((Object)null);
        ((ArrayList) term143060).add((Object)null);
        ((ArrayList) term143060).add((Object)null);
        ((ArrayList) term143060).add((Object)null);
        ((ArrayList) term143060).add((Object)null);
        ((ArrayList) term143060).add((Object)null);
        ((ArrayList) term143060).add((Object)null);
        ((ArrayList) term143060).add((Object)null);
        ((ArrayList) term143060).add((Object)null);
        term143059 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term143059, term143059.getClass(), "defaults", null);
        setField(term143059, term143059.getClass(), "file", null);
        setField(term143059, term143059.getClass(), "basePath", null);
        setField(term143059, term143059.getClass(), "fileSeparator", null);
        setBooleanField(term143059, term143059.getClass(), "isInitialized", false);
        setField(term143059, term143059.getClass(), "includePropertyName", null);
        setField(term143059, term143059.getClass(), "keysAsListed", term143060);
        setField(term143059, term143059.getClass(), "table", null);
        setIntField(term143059, term143059.getClass(), "count", 0);
        setIntField(term143059, term143059.getClass(), "threshold", 0);
        setFloatField(term143059, term143059.getClass(), "loadFactor", 0.0F);
        setIntField(term143059, term143059.getClass(), "modCount", 0);
        setField(term143059, term143059.getClass(), "keySet", null);
        setField(term143059, term143059.getClass(), "entrySet", null);
        setField(term143059, term143059.getClass(), "values", null);
        ArrayList term143055 = new ArrayList();
        term143051 = newInstance(Class.forName("java.util.ArrayList$Itr"));
        setIntField(term143051, term143051.getClass(), "cursor", 0);
        setIntField(term143051, term143051.getClass(), "lastRet", -1);
        setIntField(term143051, term143051.getClass(), "expectedModCount", 0);
        setField(term143051, term143051.getClass(), "this$0", term143055);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getKeys", argTypes, term142607, args);
        assertTrue(recursiveEquals(term142607, term143059));
        assertTrue(recursiveEquals(retValue, term143051));
    }

};


