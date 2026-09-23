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

public class ExtendedProperties_getKeys_406677329424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180191;
     Object term193530;
     Object term192488;

    public ExtendedProperties_getKeys_406677329424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term180243 = new ArrayList();
        ((ArrayList) term180243).add("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        ((ArrayList) term180243).add("  ");
        ((ArrayList) term180243).add("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        ((ArrayList) term180243).add("");
        ((ArrayList) term180243).add("");
        term180191 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term180191, term180191.getClass(), "keysAsListed", term180243);
        ArrayList term193531 = new ArrayList();
        ((ArrayList) term193531).add("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        ((ArrayList) term193531).add("  ");
        ((ArrayList) term193531).add("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        ((ArrayList) term193531).add("");
        ((ArrayList) term193531).add("");
        term193530 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term193530, term193530.getClass(), "defaults", null);
        setField(term193530, term193530.getClass(), "file", null);
        setField(term193530, term193530.getClass(), "basePath", null);
        setField(term193530, term193530.getClass(), "fileSeparator", null);
        setBooleanField(term193530, term193530.getClass(), "isInitialized", false);
        setField(term193530, term193530.getClass(), "includePropertyName", null);
        setField(term193530, term193530.getClass(), "keysAsListed", term193531);
        setField(term193530, term193530.getClass(), "table", null);
        setIntField(term193530, term193530.getClass(), "count", 0);
        setIntField(term193530, term193530.getClass(), "threshold", 0);
        setFloatField(term193530, term193530.getClass(), "loadFactor", 0.0F);
        setIntField(term193530, term193530.getClass(), "modCount", 0);
        setField(term193530, term193530.getClass(), "keySet", null);
        setField(term193530, term193530.getClass(), "entrySet", null);
        setField(term193530, term193530.getClass(), "values", null);
        ArrayList term192492 = new ArrayList();
        ((ArrayList) term192492).add("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        ((ArrayList) term192492).add("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        term192488 = newInstance(Class.forName("java.util.ArrayList$Itr"));
        setIntField(term192488, term192488.getClass(), "cursor", 0);
        setIntField(term192488, term192488.getClass(), "lastRet", -1);
        setIntField(term192488, term192488.getClass(), "expectedModCount", 2);
        setField(term192488, term192488.getClass(), "this$0", term192492);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "    ";
        Object retValue = callMethod(klass, "getKeys", argTypes, term180191, args);
        assertTrue(recursiveEquals(term180191, term193530));
        assertTrue(recursiveEquals(retValue, term192488));
    }

};


