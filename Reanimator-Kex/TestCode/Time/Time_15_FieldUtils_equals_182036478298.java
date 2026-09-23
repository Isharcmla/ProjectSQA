package org.joda.time.field;

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
import static org.joda.time.field.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.field.EqualityUtils.*;

public class FieldUtils_equals_182036478298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7564;
     Object term7612;
     Object term7631;
     Object term7632;

    public FieldUtils_equals_182036478298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7564 = newInstance(Class.forName("java.lang.ThreadGroup"));
        term7612 = newInstance(Class.forName("java.lang.ThreadGroup"));
        term7631 = newInstance(Class.forName("java.lang.ThreadGroup"));
        setField(term7631, term7631.getClass(), "parent", null);
        setField(term7631, term7631.getClass(), "name", null);
        setIntField(term7631, term7631.getClass(), "maxPriority", 0);
        setBooleanField(term7631, term7631.getClass(), "destroyed", false);
        setBooleanField(term7631, term7631.getClass(), "daemon", false);
        setIntField(term7631, term7631.getClass(), "nUnstartedThreads", 0);
        setIntField(term7631, term7631.getClass(), "nthreads", 0);
        setField(term7631, term7631.getClass(), "threads", null);
        setIntField(term7631, term7631.getClass(), "ngroups", 0);
        setField(term7631, term7631.getClass(), "groups", null);
        term7632 = newInstance(Class.forName("java.lang.ThreadGroup"));
        setField(term7632, term7632.getClass(), "parent", null);
        setField(term7632, term7632.getClass(), "name", null);
        setIntField(term7632, term7632.getClass(), "maxPriority", 0);
        setBooleanField(term7632, term7632.getClass(), "destroyed", false);
        setBooleanField(term7632, term7632.getClass(), "daemon", false);
        setIntField(term7632, term7632.getClass(), "nUnstartedThreads", 0);
        setIntField(term7632, term7632.getClass(), "nthreads", 0);
        setField(term7632, term7632.getClass(), "threads", null);
        setIntField(term7632, term7632.getClass(), "ngroups", 0);
        setField(term7632, term7632.getClass(), "groups", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.FieldUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term7564;
        args[1] = term7612;
        Object retValue = callMethod(klass, "equals", argTypes, null, args);
        assertTrue(recursiveEquals(term7564, term7631));
        assertTrue(recursiveEquals(term7612, term7632));
        assertTrue(recursiveEquals(retValue, false));
    }

};


