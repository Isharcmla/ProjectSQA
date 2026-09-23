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

public class ExtendedProperties_getKeys_406677329198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109598;
     Object term112966;
     Object term112311;

    public ExtendedProperties_getKeys_406677329198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term109802 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term109650 = new ArrayList();
        ((ArrayList) term109650).add("                                                                                                                                ");
        ((ArrayList) term109650).add("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        ((ArrayList) term109650).add("");
        ((ArrayList) term109650).add((Object)null);
        ((ArrayList) term109650).add((Object)null);
        ((ArrayList) term109650).add((Object)null);
        ((ArrayList) term109650).add((Object)null);
        ((ArrayList) term109650).add((Object)null);
        ((ArrayList) term109650).add(term109802);
        ((ArrayList) term109650).add((Object)null);
        ((ArrayList) term109650).add((Object)null);
        ((ArrayList) term109650).add((Object)null);
        ((ArrayList) term109650).add((Object)null);
        ((ArrayList) term109650).add((Object)null);
        ((ArrayList) term109650).add((Object)null);
        ((ArrayList) term109650).add((Object)null);
        ((ArrayList) term109650).add((Object)null);
        ((ArrayList) term109650).add((Object)null);
        ((ArrayList) term109650).add((Object)null);
        ((ArrayList) term109650).add((Object)null);
        ((ArrayList) term109650).add((Object)null);
        ((ArrayList) term109650).add((Object)null);
        ((ArrayList) term109650).add((Object)null);
        ((ArrayList) term109650).add((Object)null);
        ((ArrayList) term109650).add((Object)null);
        ((ArrayList) term109650).add((Object)null);
        ((ArrayList) term109650).add((Object)null);
        ((ArrayList) term109650).add((Object)null);
        ((ArrayList) term109650).add((Object)null);
        ((ArrayList) term109650).add((Object)null);
        ((ArrayList) term109650).add((Object)null);
        ((ArrayList) term109650).add((Object)null);
        ((ArrayList) term109650).add((Object)null);
        ((ArrayList) term109650).add((Object)null);
        ((ArrayList) term109650).add((Object)null);
        ((ArrayList) term109650).add((Object)null);
        ((ArrayList) term109650).add((Object)null);
        ((ArrayList) term109650).add((Object)null);
        ((ArrayList) term109650).add((Object)null);
        ((ArrayList) term109650).add((Object)null);
        ((ArrayList) term109650).add((Object)null);
        ((ArrayList) term109650).add((Object)null);
        ((ArrayList) term109650).add((Object)null);
        term109598 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term109598, term109598.getClass(), "keysAsListed", term109650);
        Object term112975 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term112967 = new ArrayList();
        ((ArrayList) term112967).add("                                                                                                                                ");
        ((ArrayList) term112967).add("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        ((ArrayList) term112967).add("");
        ((ArrayList) term112967).add((Object)null);
        ((ArrayList) term112967).add((Object)null);
        ((ArrayList) term112967).add((Object)null);
        ((ArrayList) term112967).add((Object)null);
        ((ArrayList) term112967).add((Object)null);
        ((ArrayList) term112967).add(term112975);
        ((ArrayList) term112967).add((Object)null);
        ((ArrayList) term112967).add((Object)null);
        ((ArrayList) term112967).add((Object)null);
        ((ArrayList) term112967).add((Object)null);
        ((ArrayList) term112967).add((Object)null);
        ((ArrayList) term112967).add((Object)null);
        ((ArrayList) term112967).add((Object)null);
        ((ArrayList) term112967).add((Object)null);
        ((ArrayList) term112967).add((Object)null);
        ((ArrayList) term112967).add((Object)null);
        ((ArrayList) term112967).add((Object)null);
        ((ArrayList) term112967).add((Object)null);
        ((ArrayList) term112967).add((Object)null);
        ((ArrayList) term112967).add((Object)null);
        ((ArrayList) term112967).add((Object)null);
        ((ArrayList) term112967).add((Object)null);
        ((ArrayList) term112967).add((Object)null);
        ((ArrayList) term112967).add((Object)null);
        ((ArrayList) term112967).add((Object)null);
        ((ArrayList) term112967).add((Object)null);
        ((ArrayList) term112967).add((Object)null);
        ((ArrayList) term112967).add((Object)null);
        ((ArrayList) term112967).add((Object)null);
        ((ArrayList) term112967).add((Object)null);
        ((ArrayList) term112967).add((Object)null);
        ((ArrayList) term112967).add((Object)null);
        ((ArrayList) term112967).add((Object)null);
        ((ArrayList) term112967).add((Object)null);
        ((ArrayList) term112967).add((Object)null);
        ((ArrayList) term112967).add((Object)null);
        ((ArrayList) term112967).add((Object)null);
        ((ArrayList) term112967).add((Object)null);
        ((ArrayList) term112967).add((Object)null);
        ((ArrayList) term112967).add((Object)null);
        term112966 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term112966, term112966.getClass(), "defaults", null);
        setField(term112966, term112966.getClass(), "file", null);
        setField(term112966, term112966.getClass(), "basePath", null);
        setField(term112966, term112966.getClass(), "fileSeparator", null);
        setBooleanField(term112966, term112966.getClass(), "isInitialized", false);
        setField(term112966, term112966.getClass(), "includePropertyName", null);
        setField(term112966, term112966.getClass(), "keysAsListed", term112967);
        setField(term112966, term112966.getClass(), "table", null);
        setIntField(term112966, term112966.getClass(), "count", 0);
        setIntField(term112966, term112966.getClass(), "threshold", 0);
        setFloatField(term112966, term112966.getClass(), "loadFactor", 0.0F);
        setIntField(term112966, term112966.getClass(), "modCount", 0);
        setField(term112966, term112966.getClass(), "keySet", null);
        setField(term112966, term112966.getClass(), "entrySet", null);
        setField(term112966, term112966.getClass(), "values", null);
        ArrayList term112315 = new ArrayList();
        ((ArrayList) term112315).add("                                                                                                                                ");
        ((ArrayList) term112315).add("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        term112311 = newInstance(Class.forName("java.util.ArrayList$Itr"));
        setIntField(term112311, term112311.getClass(), "cursor", 0);
        setIntField(term112311, term112311.getClass(), "lastRet", -1);
        setIntField(term112311, term112311.getClass(), "expectedModCount", 2);
        setField(term112311, term112311.getClass(), "this$0", term112315);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = " ";
        Object retValue = callMethod(klass, "getKeys", argTypes, term109598, args);
        assertTrue(recursiveEquals(term109598, term112966));
        assertTrue(recursiveEquals(retValue, term112311));
    }

};


