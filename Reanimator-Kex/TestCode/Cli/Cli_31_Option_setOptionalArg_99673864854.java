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
import java.lang.Boolean;

public class Option_setOptionalArg_99673864854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term868;
     Object term926;
     Object term6197;

    public Option_setOptionalArg_99673864854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term921 = new ArrayList();
        term868 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term920 = newInstance(Class.forName("java.lang.Object"));
        setField(term868, term868.getClass(), "opt", "xrwlQZdwCp");
        setField(term868, term868.getClass(), "longOpt", "IDCWpPLRkE");
        setField(term868, term868.getClass(), "argName", "nyiiPDVjAc");
        setField(term868, term868.getClass(), "description", "aKnKipADSo");
        setBooleanField(term868, term868.getClass(), "required", true);
        setBooleanField(term868, term868.getClass(), "optionalArg", true);
        setIntField(term868, term868.getClass(), "numberOfArgs", -2038273078);
        setField(term868, term868.getClass(), "type", term920);
        setField(term868, term868.getClass(), "values", term921);
        setCharField(term868, term868.getClass(), "valuesep", 't');
        term926 = new Boolean(false);
        ArrayList term6207 = new ArrayList();
        term6197 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term6206 = newInstance(Class.forName("java.lang.Object"));
        setField(term6197, term6197.getClass(), "opt", "xrwlQZdwCp");
        setField(term6197, term6197.getClass(), "longOpt", "IDCWpPLRkE");
        setField(term6197, term6197.getClass(), "argName", "nyiiPDVjAc");
        setField(term6197, term6197.getClass(), "description", "aKnKipADSo");
        setBooleanField(term6197, term6197.getClass(), "required", true);
        setBooleanField(term6197, term6197.getClass(), "optionalArg", false);
        setIntField(term6197, term6197.getClass(), "numberOfArgs", -2038273078);
        setField(term6197, term6197.getClass(), "type", term6206);
        setField(term6197, term6197.getClass(), "values", term6207);
        setCharField(term6197, term6197.getClass(), "valuesep", 't');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term926;
        callMethod(klass, "setOptionalArg", argTypes, term868, args);
        assertTrue(recursiveEquals(term868, term6197));
        assertTrue(recursiveEquals(term926, false));
    }

};


