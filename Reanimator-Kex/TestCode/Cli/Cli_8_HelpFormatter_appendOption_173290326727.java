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

public class HelpFormatter_appendOption_173290326727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3060;
     Object term3092;
     Object term3150;

    public HelpFormatter_appendOption_173290326727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3060 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term3073 = (byte[]) newByteArray(16);
        setField(term3060, term3060.getClass(), "toStringCache", "kuTXqwMtDB");
        setField(term3060, term3060.getClass(), "value", term3073);
        setByteField(term3060, term3060.getClass(), "coder", (byte) 48);
        setIntField(term3060, term3060.getClass(), "count", 1048535127);
        ArrayList term3145 = new ArrayList();
        term3092 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term3144 = newInstance(Class.forName("java.lang.Object"));
        setField(term3092, term3092.getClass(), "opt", "Ghbwtircqb");
        setField(term3092, term3092.getClass(), "longOpt", "xrwlQZdwCp");
        setField(term3092, term3092.getClass(), "argName", "IDCWpPLRkE");
        setField(term3092, term3092.getClass(), "description", "nyiiPDVjAc");
        setBooleanField(term3092, term3092.getClass(), "required", true);
        setBooleanField(term3092, term3092.getClass(), "optionalArg", true);
        setIntField(term3092, term3092.getClass(), "numberOfArgs", -655067527);
        setField(term3092, term3092.getClass(), "type", term3144);
        setField(term3092, term3092.getClass(), "values", term3145);
        setCharField(term3092, term3092.getClass(), "valuesep", 'E');
        term3150 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("org.apache.commons.cli.Option");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term3060;
        args[1] = term3092;
        args[2] = term3150;
        callMethod(klass, "appendOption", argTypes, null, args);
    }

};


