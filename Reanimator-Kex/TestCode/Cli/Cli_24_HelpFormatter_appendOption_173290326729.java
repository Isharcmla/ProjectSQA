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
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Boolean;

public class HelpFormatter_appendOption_173290326729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3214;
     Object term3246;
     Object term3304;

    public HelpFormatter_appendOption_173290326729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3214 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term3227 = (byte[]) newByteArray(16);
        setField(term3214, term3214.getClass(), "toStringCache", "kuTXqwMtDB");
        setField(term3214, term3214.getClass(), "value", term3227);
        setByteField(term3214, term3214.getClass(), "coder", (byte) 48);
        setIntField(term3214, term3214.getClass(), "count", 1048535127);
        ArrayList term3299 = new ArrayList();
        term3246 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term3298 = newInstance(Class.forName("java.lang.Object"));
        setField(term3246, term3246.getClass(), "opt", "Ghbwtircqb");
        setField(term3246, term3246.getClass(), "longOpt", "xrwlQZdwCp");
        setField(term3246, term3246.getClass(), "argName", "IDCWpPLRkE");
        setField(term3246, term3246.getClass(), "description", "nyiiPDVjAc");
        setBooleanField(term3246, term3246.getClass(), "required", true);
        setBooleanField(term3246, term3246.getClass(), "optionalArg", true);
        setIntField(term3246, term3246.getClass(), "numberOfArgs", -655067527);
        setField(term3246, term3246.getClass(), "type", term3298);
        setField(term3246, term3246.getClass(), "values", term3299);
        setCharField(term3246, term3246.getClass(), "valuesep", 'E');
        term3304 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("org.apache.commons.cli.Option");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term3214;
        args[1] = term3246;
        args[2] = term3304;
        callMethod(klass, "appendOption", argTypes, null, args);
    }

};


