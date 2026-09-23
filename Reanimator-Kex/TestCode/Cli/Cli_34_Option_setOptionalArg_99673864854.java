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
import java.util.ArrayList;
import java.lang.Boolean;

public class Option_setOptionalArg_99673864854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term860;
     Object term917;
     Object term6109;

    public Option_setOptionalArg_99673864854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term912 = new ArrayList();
        term860 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term860, term860.getClass(), "opt", "xrwlQZdwCp");
        setField(term860, term860.getClass(), "longOpt", "IDCWpPLRkE");
        setField(term860, term860.getClass(), "argName", "nyiiPDVjAc");
        setField(term860, term860.getClass(), "description", "aKnKipADSo");
        setBooleanField(term860, term860.getClass(), "required", true);
        setBooleanField(term860, term860.getClass(), "optionalArg", true);
        setIntField(term860, term860.getClass(), "numberOfArgs", -2038273078);
        setField(term860, term860.getClass(), "type", null);
        setField(term860, term860.getClass(), "values", term912);
        setCharField(term860, term860.getClass(), "valuesep", 't');
        term917 = new Boolean(false);
        ArrayList term6118 = new ArrayList();
        term6109 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term6109, term6109.getClass(), "opt", "xrwlQZdwCp");
        setField(term6109, term6109.getClass(), "longOpt", "IDCWpPLRkE");
        setField(term6109, term6109.getClass(), "argName", "nyiiPDVjAc");
        setField(term6109, term6109.getClass(), "description", "aKnKipADSo");
        setBooleanField(term6109, term6109.getClass(), "required", true);
        setBooleanField(term6109, term6109.getClass(), "optionalArg", false);
        setIntField(term6109, term6109.getClass(), "numberOfArgs", -2038273078);
        setField(term6109, term6109.getClass(), "type", null);
        setField(term6109, term6109.getClass(), "values", term6118);
        setCharField(term6109, term6109.getClass(), "valuesep", 't');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term917;
        callMethod(klass, "setOptionalArg", argTypes, term860, args);
        assertTrue(recursiveEquals(term860, term6109));
        assertTrue(recursiveEquals(term917, false));
    }

};


