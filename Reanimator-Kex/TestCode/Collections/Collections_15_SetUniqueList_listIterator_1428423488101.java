package org.apache.commons.collections.list;

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
import static org.apache.commons.collections.list.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.list.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;

public class SetUniqueList_listIterator_1428423488101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23048;
     Object term23136;
     Object term23123;

    public SetUniqueList_listIterator_1428423488101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term23100 = new ArrayList();
        term23048 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term23048, term23048.getClass(), "collection", term23100);
        ArrayList term23137 = new ArrayList();
        term23136 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term23136, term23136.getClass(), "set", null);
        setField(term23136, term23136.getClass(), "collection", term23137);
        ArrayList term23106 = new ArrayList();
        term23123 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList$SetListListIterator"));
        Object term23124 = newInstance(Class.forName("java.util.ArrayList$ListItr"));
        setField(term23123, term23123.getClass(), "set", null);
        setField(term23123, term23123.getClass(), "last", null);
        setField(term23124, term23124.getClass(), "this$0", term23106);
        setIntField(term23124, term23124.getClass(), "cursor", 0);
        setIntField(term23124, term23124.getClass(), "lastRet", -1);
        setIntField(term23124, term23124.getClass(), "expectedModCount", 0);
        setField(term23123, term23123.getClass(), "iterator", term23124);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "listIterator", argTypes, term23048, args);
        assertTrue(recursiveEquals(term23048, term23136));
        assertTrue(recursiveEquals(retValue, term23123));
    }

};


