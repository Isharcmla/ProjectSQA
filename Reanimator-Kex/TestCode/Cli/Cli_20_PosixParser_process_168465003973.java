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

public class PosixParser_process_168465003973 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38055;
     Object term38197;

    public PosixParser_process_168465003973() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term38171 = new ArrayList();
        term38055 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term38119 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setIntField(term38119, term38119.getClass(), "numberOfArgs", 0);
        setField(term38055, term38055.getClass(), "currentOption", term38119);
        setBooleanField(term38055, term38055.getClass(), "eatTheRest", false);
        setField(term38055, term38055.getClass(), "tokens", term38171);
        ArrayList term38198 = new ArrayList();
        ((ArrayList) term38198).add("--");
        ((ArrayList) term38198).add((Object)null);
        term38197 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term38202 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term38197, term38197.getClass(), "tokens", term38198);
        setBooleanField(term38197, term38197.getClass(), "eatTheRest", true);
        setField(term38202, term38202.getClass(), "opt", null);
        setField(term38202, term38202.getClass(), "longOpt", null);
        setField(term38202, term38202.getClass(), "argName", null);
        setField(term38202, term38202.getClass(), "description", null);
        setBooleanField(term38202, term38202.getClass(), "required", false);
        setBooleanField(term38202, term38202.getClass(), "optionalArg", false);
        setIntField(term38202, term38202.getClass(), "numberOfArgs", 0);
        setField(term38202, term38202.getClass(), "type", null);
        setField(term38202, term38202.getClass(), "values", null);
        setCharField(term38202, term38202.getClass(), "valuesep", (char) 0);
        setField(term38197, term38197.getClass(), "currentOption", term38202);
        setField(term38197, term38197.getClass(), "options", null);
        setField(term38197, term38197.getClass(), "cmd", null);
        setField(term38197, term38197.getClass(), "requiredOptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "process", argTypes, term38055, args);
        assertTrue(recursiveEquals(term38055, term38197));
    }

};


