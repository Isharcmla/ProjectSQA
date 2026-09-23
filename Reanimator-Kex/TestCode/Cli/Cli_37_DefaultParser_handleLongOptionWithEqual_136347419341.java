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
import java.lang.StringIndexOutOfBoundsException;
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class DefaultParser_handleLongOptionWithEqual_136347419341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3355;

    public DefaultParser_handleLongOptionWithEqual_136347419341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term3357 = new LinkedList();
        ArrayList term3360 = new ArrayList();
        LinkedHashMap term3365 = new LinkedHashMap();
        LinkedHashMap term3371 = new LinkedHashMap();
        ArrayList term3377 = new ArrayList();
        LinkedHashMap term3381 = new LinkedHashMap();
        ArrayList term3452 = new ArrayList();
        ArrayList term3458 = new ArrayList();
        term3355 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term3356 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term3364 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term3400 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term3356, term3356.getClass(), "args", term3357);
        setField(term3356, term3356.getClass(), "options", term3360);
        setField(term3355, term3355.getClass(), "cmd", term3356);
        setField(term3364, term3364.getClass(), "shortOpts", term3365);
        setField(term3364, term3364.getClass(), "longOpts", term3371);
        setField(term3364, term3364.getClass(), "requiredOpts", term3377);
        setField(term3364, term3364.getClass(), "optionGroups", term3381);
        setField(term3355, term3355.getClass(), "options", term3364);
        setBooleanField(term3355, term3355.getClass(), "stopAtNonOption", true);
        setField(term3355, term3355.getClass(), "currentToken", "VYkqXKVlAJ");
        setField(term3400, term3400.getClass(), "opt", "XkIoWJRNwN");
        setField(term3400, term3400.getClass(), "longOpt", "aNWLJdrZMq");
        setField(term3400, term3400.getClass(), "argName", "HHmNoYxIGj");
        setField(term3400, term3400.getClass(), "description", "PtirvZmsGt");
        setBooleanField(term3400, term3400.getClass(), "required", true);
        setBooleanField(term3400, term3400.getClass(), "optionalArg", true);
        setIntField(term3400, term3400.getClass(), "numberOfArgs", -1685132342);
        setField(term3400, term3400.getClass(), "type", null);
        setField(term3400, term3400.getClass(), "values", term3452);
        setCharField(term3400, term3400.getClass(), "valuesep", 't');
        setField(term3355, term3355.getClass(), "currentOption", term3400);
        setBooleanField(term3355, term3355.getClass(), "skipParsing", false);
        setField(term3355, term3355.getClass(), "expectedOpts", term3458);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HWkpTmtlrc";
        try {
            callMethod(klass, "handleLongOptionWithEqual", argTypes, term3355, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


