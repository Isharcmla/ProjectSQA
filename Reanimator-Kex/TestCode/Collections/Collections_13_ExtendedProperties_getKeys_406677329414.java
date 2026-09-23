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

public class ExtendedProperties_getKeys_406677329414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172239;
     Object term172638;
     Object term172627;

    public ExtendedProperties_getKeys_406677329414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term172291 = new ArrayList();
        ((ArrayList) term172291).add("");
        ((ArrayList) term172291).add("");
        ((ArrayList) term172291).add("");
        ((ArrayList) term172291).add("");
        ((ArrayList) term172291).add((Object)null);
        ((ArrayList) term172291).add((Object)null);
        ((ArrayList) term172291).add((Object)null);
        ((ArrayList) term172291).add((Object)null);
        ((ArrayList) term172291).add((Object)null);
        ((ArrayList) term172291).add((Object)null);
        ((ArrayList) term172291).add((Object)null);
        ((ArrayList) term172291).add((Object)null);
        term172239 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term172239, term172239.getClass(), "keysAsListed", term172291);
        ArrayList term172639 = new ArrayList();
        ((ArrayList) term172639).add("");
        ((ArrayList) term172639).add("");
        ((ArrayList) term172639).add("");
        ((ArrayList) term172639).add("");
        ((ArrayList) term172639).add((Object)null);
        ((ArrayList) term172639).add((Object)null);
        ((ArrayList) term172639).add((Object)null);
        ((ArrayList) term172639).add((Object)null);
        ((ArrayList) term172639).add((Object)null);
        ((ArrayList) term172639).add((Object)null);
        ((ArrayList) term172639).add((Object)null);
        ((ArrayList) term172639).add((Object)null);
        term172638 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term172638, term172638.getClass(), "defaults", null);
        setField(term172638, term172638.getClass(), "file", null);
        setField(term172638, term172638.getClass(), "basePath", null);
        setField(term172638, term172638.getClass(), "fileSeparator", null);
        setBooleanField(term172638, term172638.getClass(), "isInitialized", false);
        setField(term172638, term172638.getClass(), "includePropertyName", null);
        setField(term172638, term172638.getClass(), "keysAsListed", term172639);
        setField(term172638, term172638.getClass(), "table", null);
        setIntField(term172638, term172638.getClass(), "count", 0);
        setIntField(term172638, term172638.getClass(), "threshold", 0);
        setFloatField(term172638, term172638.getClass(), "loadFactor", 0.0F);
        setIntField(term172638, term172638.getClass(), "modCount", 0);
        setField(term172638, term172638.getClass(), "keySet", null);
        setField(term172638, term172638.getClass(), "entrySet", null);
        setField(term172638, term172638.getClass(), "values", null);
        ArrayList term172631 = new ArrayList();
        term172627 = newInstance(Class.forName("java.util.ArrayList$Itr"));
        setIntField(term172627, term172627.getClass(), "cursor", 0);
        setIntField(term172627, term172627.getClass(), "lastRet", -1);
        setIntField(term172627, term172627.getClass(), "expectedModCount", 0);
        setField(term172627, term172627.getClass(), "this$0", term172631);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = " ";
        Object retValue = callMethod(klass, "getKeys", argTypes, term172239, args);
        assertTrue(recursiveEquals(term172239, term172638));
        assertTrue(recursiveEquals(retValue, term172627));
    }

};


