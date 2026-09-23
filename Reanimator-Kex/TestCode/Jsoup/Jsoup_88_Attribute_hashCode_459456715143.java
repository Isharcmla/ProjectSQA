package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;

public class Attribute_hashCode_459456715143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194507;
     Object term194552;

    public Attribute_hashCode_459456715143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term194507 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term194507, term194507.getClass(), "key", null);
        setField(term194507, term194507.getClass(), "val", "");
        term194552 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term194552, term194552.getClass(), "key", null);
        setField(term194552, term194552.getClass(), "val", "");
        setField(term194552, term194552.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term194507, args);
        assertTrue(recursiveEquals(term194507, term194552));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


