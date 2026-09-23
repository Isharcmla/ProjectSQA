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

public class ExtendedProperties_getKeys_406677329369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150865;
     Object term156576;
     Object term156072;

    public ExtendedProperties_getKeys_406677329369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term150917 = new ArrayList();
        ((ArrayList) term150917).add(" ");
        ((ArrayList) term150917).add("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        ((ArrayList) term150917).add("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        ((ArrayList) term150917).add((Object)null);
        term150865 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term150865, term150865.getClass(), "keysAsListed", term150917);
        ArrayList term156577 = new ArrayList();
        ((ArrayList) term156577).add(" ");
        ((ArrayList) term156577).add("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        ((ArrayList) term156577).add("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        ((ArrayList) term156577).add((Object)null);
        term156576 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term156576, term156576.getClass(), "defaults", null);
        setField(term156576, term156576.getClass(), "file", null);
        setField(term156576, term156576.getClass(), "basePath", null);
        setField(term156576, term156576.getClass(), "fileSeparator", null);
        setBooleanField(term156576, term156576.getClass(), "isInitialized", false);
        setField(term156576, term156576.getClass(), "includePropertyName", null);
        setField(term156576, term156576.getClass(), "keysAsListed", term156577);
        setField(term156576, term156576.getClass(), "table", null);
        setIntField(term156576, term156576.getClass(), "count", 0);
        setIntField(term156576, term156576.getClass(), "threshold", 0);
        setFloatField(term156576, term156576.getClass(), "loadFactor", 0.0F);
        setIntField(term156576, term156576.getClass(), "modCount", 0);
        setField(term156576, term156576.getClass(), "keySet", null);
        setField(term156576, term156576.getClass(), "entrySet", null);
        setField(term156576, term156576.getClass(), "values", null);
        ArrayList term156076 = new ArrayList();
        term156072 = newInstance(Class.forName("java.util.ArrayList$Itr"));
        setIntField(term156072, term156072.getClass(), "cursor", 0);
        setIntField(term156072, term156072.getClass(), "lastRet", -1);
        setIntField(term156072, term156072.getClass(), "expectedModCount", 0);
        setField(term156072, term156072.getClass(), "this$0", term156076);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ";
        Object retValue = callMethod(klass, "getKeys", argTypes, term150865, args);
        assertTrue(recursiveEquals(term150865, term156576));
        assertTrue(recursiveEquals(retValue, term156072));
    }

};


