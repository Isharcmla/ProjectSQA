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

public class ExtendedProperties_getKeys_406677329379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160604;
     Object term163545;
     Object term162890;

    public ExtendedProperties_getKeys_406677329379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term160808 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term160656 = new ArrayList();
        ((ArrayList) term160656).add("                                                                                                                                ");
        ((ArrayList) term160656).add("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        ((ArrayList) term160656).add("");
        ((ArrayList) term160656).add((Object)null);
        ((ArrayList) term160656).add((Object)null);
        ((ArrayList) term160656).add((Object)null);
        ((ArrayList) term160656).add((Object)null);
        ((ArrayList) term160656).add((Object)null);
        ((ArrayList) term160656).add(term160808);
        ((ArrayList) term160656).add((Object)null);
        ((ArrayList) term160656).add((Object)null);
        ((ArrayList) term160656).add((Object)null);
        ((ArrayList) term160656).add((Object)null);
        ((ArrayList) term160656).add((Object)null);
        ((ArrayList) term160656).add((Object)null);
        ((ArrayList) term160656).add((Object)null);
        ((ArrayList) term160656).add((Object)null);
        ((ArrayList) term160656).add((Object)null);
        ((ArrayList) term160656).add((Object)null);
        ((ArrayList) term160656).add((Object)null);
        ((ArrayList) term160656).add((Object)null);
        ((ArrayList) term160656).add((Object)null);
        ((ArrayList) term160656).add((Object)null);
        ((ArrayList) term160656).add((Object)null);
        ((ArrayList) term160656).add((Object)null);
        ((ArrayList) term160656).add((Object)null);
        ((ArrayList) term160656).add((Object)null);
        ((ArrayList) term160656).add((Object)null);
        ((ArrayList) term160656).add((Object)null);
        ((ArrayList) term160656).add((Object)null);
        ((ArrayList) term160656).add((Object)null);
        ((ArrayList) term160656).add((Object)null);
        ((ArrayList) term160656).add((Object)null);
        ((ArrayList) term160656).add((Object)null);
        ((ArrayList) term160656).add((Object)null);
        ((ArrayList) term160656).add((Object)null);
        ((ArrayList) term160656).add((Object)null);
        ((ArrayList) term160656).add((Object)null);
        ((ArrayList) term160656).add((Object)null);
        ((ArrayList) term160656).add((Object)null);
        ((ArrayList) term160656).add((Object)null);
        ((ArrayList) term160656).add((Object)null);
        ((ArrayList) term160656).add((Object)null);
        term160604 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term160604, term160604.getClass(), "keysAsListed", term160656);
        Object term163554 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term163546 = new ArrayList();
        ((ArrayList) term163546).add("                                                                                                                                ");
        ((ArrayList) term163546).add("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        ((ArrayList) term163546).add("");
        ((ArrayList) term163546).add((Object)null);
        ((ArrayList) term163546).add((Object)null);
        ((ArrayList) term163546).add((Object)null);
        ((ArrayList) term163546).add((Object)null);
        ((ArrayList) term163546).add((Object)null);
        ((ArrayList) term163546).add(term163554);
        ((ArrayList) term163546).add((Object)null);
        ((ArrayList) term163546).add((Object)null);
        ((ArrayList) term163546).add((Object)null);
        ((ArrayList) term163546).add((Object)null);
        ((ArrayList) term163546).add((Object)null);
        ((ArrayList) term163546).add((Object)null);
        ((ArrayList) term163546).add((Object)null);
        ((ArrayList) term163546).add((Object)null);
        ((ArrayList) term163546).add((Object)null);
        ((ArrayList) term163546).add((Object)null);
        ((ArrayList) term163546).add((Object)null);
        ((ArrayList) term163546).add((Object)null);
        ((ArrayList) term163546).add((Object)null);
        ((ArrayList) term163546).add((Object)null);
        ((ArrayList) term163546).add((Object)null);
        ((ArrayList) term163546).add((Object)null);
        ((ArrayList) term163546).add((Object)null);
        ((ArrayList) term163546).add((Object)null);
        ((ArrayList) term163546).add((Object)null);
        ((ArrayList) term163546).add((Object)null);
        ((ArrayList) term163546).add((Object)null);
        ((ArrayList) term163546).add((Object)null);
        ((ArrayList) term163546).add((Object)null);
        ((ArrayList) term163546).add((Object)null);
        ((ArrayList) term163546).add((Object)null);
        ((ArrayList) term163546).add((Object)null);
        ((ArrayList) term163546).add((Object)null);
        ((ArrayList) term163546).add((Object)null);
        ((ArrayList) term163546).add((Object)null);
        ((ArrayList) term163546).add((Object)null);
        ((ArrayList) term163546).add((Object)null);
        ((ArrayList) term163546).add((Object)null);
        ((ArrayList) term163546).add((Object)null);
        ((ArrayList) term163546).add((Object)null);
        term163545 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term163545, term163545.getClass(), "defaults", null);
        setField(term163545, term163545.getClass(), "file", null);
        setField(term163545, term163545.getClass(), "basePath", null);
        setField(term163545, term163545.getClass(), "fileSeparator", null);
        setBooleanField(term163545, term163545.getClass(), "isInitialized", false);
        setField(term163545, term163545.getClass(), "includePropertyName", null);
        setField(term163545, term163545.getClass(), "keysAsListed", term163546);
        setField(term163545, term163545.getClass(), "table", null);
        setIntField(term163545, term163545.getClass(), "count", 0);
        setIntField(term163545, term163545.getClass(), "threshold", 0);
        setFloatField(term163545, term163545.getClass(), "loadFactor", 0.0F);
        setIntField(term163545, term163545.getClass(), "modCount", 0);
        setField(term163545, term163545.getClass(), "keySet", null);
        setField(term163545, term163545.getClass(), "entrySet", null);
        setField(term163545, term163545.getClass(), "values", null);
        ArrayList term162894 = new ArrayList();
        ((ArrayList) term162894).add("                                                                                                                                ");
        ((ArrayList) term162894).add("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        term162890 = newInstance(Class.forName("java.util.ArrayList$Itr"));
        setIntField(term162890, term162890.getClass(), "cursor", 0);
        setIntField(term162890, term162890.getClass(), "lastRet", -1);
        setIntField(term162890, term162890.getClass(), "expectedModCount", 2);
        setField(term162890, term162890.getClass(), "this$0", term162894);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = " ";
        Object retValue = callMethod(klass, "getKeys", argTypes, term160604, args);
        assertTrue(recursiveEquals(term160604, term163545));
        assertTrue(recursiveEquals(retValue, term162890));
    }

};


