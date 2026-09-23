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

public class Attribute_hashCode_45945671584 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148872;
     Object term148989;

    public Attribute_hashCode_45945671584() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148872 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term148872, term148872.getClass(), "key", null);
        term148989 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term148989, term148989.getClass(), "key", null);
        setField(term148989, term148989.getClass(), "val", null);
        setField(term148989, term148989.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term148872, args);
        assertTrue(recursiveEquals(term148872, term148989));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


