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

public class ExtendedProperties_getKeys_406677329681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term587290;
     Object term588951;
     Object term588682;

    public ExtendedProperties_getKeys_406677329681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term587622 = new ArrayList();
        Object term587660 = newInstance(Class.forName("java.lang.Object"));
        byte[] term586566 = (byte[]) newByteArray(0);
        ArrayList term587342 = new ArrayList();
        ((ArrayList) term587342).add("");
        ((ArrayList) term587342).add("                                                                                                                                                                                                                                                                ");
        ((ArrayList) term587342).add("");
        ((ArrayList) term587342).add("");
        ((ArrayList) term587342).add("");
        ((ArrayList) term587342).add("");
        ((ArrayList) term587342).add(term587622);
        ((ArrayList) term587342).add((Object)null);
        ((ArrayList) term587342).add((Object)null);
        ((ArrayList) term587342).add(term587660);
        ((ArrayList) term587342).add((Object)null);
        ((ArrayList) term587342).add((Object)null);
        ((ArrayList) term587342).add((Object)null);
        ((ArrayList) term587342).add((Object)null);
        ((ArrayList) term587342).add((Object)null);
        ((ArrayList) term587342).add((Object)null);
        ((ArrayList) term587342).add(term586566);
        term587290 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term587290, term587290.getClass(), "keysAsListed", term587342);
        ArrayList term588966 = new ArrayList();
        Object term588968 = newInstance(Class.forName("java.lang.Object"));
        byte[] term588969 = (byte[]) newByteArray(0);
        ArrayList term588952 = new ArrayList();
        ((ArrayList) term588952).add("");
        ((ArrayList) term588952).add("                                                                                                                                                                                                                                                                ");
        ((ArrayList) term588952).add("");
        ((ArrayList) term588952).add("");
        ((ArrayList) term588952).add("");
        ((ArrayList) term588952).add("");
        ((ArrayList) term588952).add(term588966);
        ((ArrayList) term588952).add((Object)null);
        ((ArrayList) term588952).add((Object)null);
        ((ArrayList) term588952).add(term588968);
        ((ArrayList) term588952).add((Object)null);
        ((ArrayList) term588952).add((Object)null);
        ((ArrayList) term588952).add((Object)null);
        ((ArrayList) term588952).add((Object)null);
        ((ArrayList) term588952).add((Object)null);
        ((ArrayList) term588952).add((Object)null);
        ((ArrayList) term588952).add(term588969);
        term588951 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term588951, term588951.getClass(), "defaults", null);
        setField(term588951, term588951.getClass(), "file", null);
        setField(term588951, term588951.getClass(), "basePath", null);
        setField(term588951, term588951.getClass(), "fileSeparator", null);
        setBooleanField(term588951, term588951.getClass(), "isInitialized", false);
        setField(term588951, term588951.getClass(), "includePropertyName", null);
        setField(term588951, term588951.getClass(), "keysAsListed", term588952);
        setField(term588951, term588951.getClass(), "table", null);
        setIntField(term588951, term588951.getClass(), "count", 0);
        setIntField(term588951, term588951.getClass(), "threshold", 0);
        setFloatField(term588951, term588951.getClass(), "loadFactor", 0.0F);
        setIntField(term588951, term588951.getClass(), "modCount", 0);
        setField(term588951, term588951.getClass(), "keySet", null);
        setField(term588951, term588951.getClass(), "entrySet", null);
        setField(term588951, term588951.getClass(), "values", null);
        ArrayList term588686 = new ArrayList();
        ((ArrayList) term588686).add("                                                                                                                                                                                                                                                                ");
        term588682 = newInstance(Class.forName("java.util.ArrayList$Itr"));
        setIntField(term588682, term588682.getClass(), "cursor", 0);
        setIntField(term588682, term588682.getClass(), "lastRet", -1);
        setIntField(term588682, term588682.getClass(), "expectedModCount", 1);
        setField(term588682, term588682.getClass(), "this$0", term588686);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = " ";
        Object retValue = callMethod(klass, "getKeys", argTypes, term587290, args);
        assertTrue(recursiveEquals(term587290, term588951));
        assertTrue(recursiveEquals(retValue, term588682));
    }

};


