package org.apache.commons.cli;

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
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.cli.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;

public class Option_getKey_118552276448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term257;
     Object term5209;

    public Option_getKey_118552276448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term310 = new ArrayList();
        term257 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term309 = newInstance(Class.forName("java.lang.Object"));
        setField(term257, term257.getClass(), "opt", "uuaPigETmJ");
        setField(term257, term257.getClass(), "longOpt", "MxlszYVzRf");
        setField(term257, term257.getClass(), "argName", "LQFpaHEwXR");
        setField(term257, term257.getClass(), "description", "oVcInYnLWB");
        setBooleanField(term257, term257.getClass(), "required", true);
        setBooleanField(term257, term257.getClass(), "optionalArg", true);
        setIntField(term257, term257.getClass(), "numberOfArgs", 1162663216);
        setField(term257, term257.getClass(), "type", term309);
        setField(term257, term257.getClass(), "values", term310);
        setCharField(term257, term257.getClass(), "valuesep", 'A');
        ArrayList term5229 = new ArrayList();
        term5209 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term5228 = newInstance(Class.forName("java.lang.Object"));
        setField(term5209, term5209.getClass(), "opt", "uuaPigETmJ");
        setField(term5209, term5209.getClass(), "longOpt", "MxlszYVzRf");
        setField(term5209, term5209.getClass(), "argName", "LQFpaHEwXR");
        setField(term5209, term5209.getClass(), "description", "oVcInYnLWB");
        setBooleanField(term5209, term5209.getClass(), "required", true);
        setBooleanField(term5209, term5209.getClass(), "optionalArg", true);
        setIntField(term5209, term5209.getClass(), "numberOfArgs", 1162663216);
        setField(term5209, term5209.getClass(), "type", term5228);
        setField(term5209, term5209.getClass(), "values", term5229);
        setCharField(term5209, term5209.getClass(), "valuesep", 'A');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getKey", argTypes, term257, args);
        assertTrue(recursiveEquals(term257, term5209));
        assertTrue(recursiveEquals(retValue, "uuaPigETmJ"));
    }

};


