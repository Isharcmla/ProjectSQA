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

public class PosixParser_process_168465003943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12838;
     Object term13536;

    public PosixParser_process_168465003943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term12954 = new ArrayList();
        term12838 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term12902 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setIntField(term12902, term12902.getClass(), "numberOfArgs", 0);
        setField(term12838, term12838.getClass(), "currentOption", term12902);
        setBooleanField(term12838, term12838.getClass(), "eatTheRest", false);
        setField(term12838, term12838.getClass(), "tokens", term12954);
        ArrayList term13537 = new ArrayList();
        ((ArrayList) term13537).add("--");
        ((ArrayList) term13537).add((Object)null);
        term13536 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term13541 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term13536, term13536.getClass(), "tokens", term13537);
        setBooleanField(term13536, term13536.getClass(), "eatTheRest", true);
        setField(term13541, term13541.getClass(), "opt", null);
        setField(term13541, term13541.getClass(), "longOpt", null);
        setField(term13541, term13541.getClass(), "argName", null);
        setField(term13541, term13541.getClass(), "description", null);
        setBooleanField(term13541, term13541.getClass(), "required", false);
        setBooleanField(term13541, term13541.getClass(), "optionalArg", false);
        setIntField(term13541, term13541.getClass(), "numberOfArgs", 0);
        setField(term13541, term13541.getClass(), "type", null);
        setField(term13541, term13541.getClass(), "values", null);
        setCharField(term13541, term13541.getClass(), "valuesep", (char) 0);
        setField(term13536, term13536.getClass(), "currentOption", term13541);
        setField(term13536, term13536.getClass(), "options", null);
        setField(term13536, term13536.getClass(), "cmd", null);
        setField(term13536, term13536.getClass(), "requiredOptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "process", argTypes, term12838, args);
        assertTrue(recursiveEquals(term12838, term13536));
    }

};


