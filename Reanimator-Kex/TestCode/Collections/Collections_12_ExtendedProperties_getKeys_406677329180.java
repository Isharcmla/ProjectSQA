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

public class ExtendedProperties_getKeys_406677329180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111028;
     Object term115868;
     Object term114826;

    public ExtendedProperties_getKeys_406677329180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term111080 = new ArrayList();
        ((ArrayList) term111080).add("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        ((ArrayList) term111080).add("  ");
        ((ArrayList) term111080).add("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        ((ArrayList) term111080).add("");
        ((ArrayList) term111080).add("");
        term111028 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term111028, term111028.getClass(), "keysAsListed", term111080);
        ArrayList term115869 = new ArrayList();
        ((ArrayList) term115869).add("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        ((ArrayList) term115869).add("  ");
        ((ArrayList) term115869).add("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        ((ArrayList) term115869).add("");
        ((ArrayList) term115869).add("");
        term115868 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term115868, term115868.getClass(), "defaults", null);
        setField(term115868, term115868.getClass(), "file", null);
        setField(term115868, term115868.getClass(), "basePath", null);
        setField(term115868, term115868.getClass(), "fileSeparator", null);
        setBooleanField(term115868, term115868.getClass(), "isInitialized", false);
        setField(term115868, term115868.getClass(), "includePropertyName", null);
        setField(term115868, term115868.getClass(), "keysAsListed", term115869);
        setField(term115868, term115868.getClass(), "table", null);
        setIntField(term115868, term115868.getClass(), "count", 0);
        setIntField(term115868, term115868.getClass(), "threshold", 0);
        setFloatField(term115868, term115868.getClass(), "loadFactor", 0.0F);
        setIntField(term115868, term115868.getClass(), "modCount", 0);
        setField(term115868, term115868.getClass(), "keySet", null);
        setField(term115868, term115868.getClass(), "entrySet", null);
        setField(term115868, term115868.getClass(), "values", null);
        ArrayList term114830 = new ArrayList();
        ((ArrayList) term114830).add("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        ((ArrayList) term114830).add("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        term114826 = newInstance(Class.forName("java.util.ArrayList$Itr"));
        setIntField(term114826, term114826.getClass(), "cursor", 0);
        setIntField(term114826, term114826.getClass(), "lastRet", -1);
        setIntField(term114826, term114826.getClass(), "expectedModCount", 2);
        setField(term114826, term114826.getClass(), "this$0", term114830);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "    ";
        Object retValue = callMethod(klass, "getKeys", argTypes, term111028, args);
        assertTrue(recursiveEquals(term111028, term115868));
        assertTrue(recursiveEquals(retValue, term114826));
    }

};


