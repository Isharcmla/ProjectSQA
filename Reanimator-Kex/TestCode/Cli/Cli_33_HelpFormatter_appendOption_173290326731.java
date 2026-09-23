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

public class HelpFormatter_appendOption_173290326731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3442;
     Object term3474;
     Object term3506;
     Object term3564;

    public HelpFormatter_appendOption_173290326731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3442 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term3473 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term3442, term3442.getClass(), "defaultWidth", 74);
        setIntField(term3442, term3442.getClass(), "defaultLeftPad", 1);
        setIntField(term3442, term3442.getClass(), "defaultDescPad", 3);
        setField(term3442, term3442.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term3442, term3442.getClass(), "defaultNewLine", "\n");
        setField(term3442, term3442.getClass(), "defaultOptPrefix", "-");
        setField(term3442, term3442.getClass(), "defaultLongOptPrefix", "--");
        setField(term3442, term3442.getClass(), "longOptSeparator", " ");
        setField(term3442, term3442.getClass(), "defaultArgName", "arg");
        setField(term3442, term3442.getClass(), "optionComparator", term3473);
        term3474 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term3487 = (byte[]) newByteArray(16);
        setField(term3474, term3474.getClass(), "toStringCache", "Ghbwtircqb");
        setField(term3474, term3474.getClass(), "value", term3487);
        setByteField(term3474, term3474.getClass(), "coder", (byte) 48);
        setIntField(term3474, term3474.getClass(), "count", 1048535127);
        ArrayList term3559 = new ArrayList();
        term3506 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term3558 = newInstance(Class.forName("java.lang.Object"));
        setField(term3506, term3506.getClass(), "opt", "xrwlQZdwCp");
        setField(term3506, term3506.getClass(), "longOpt", "IDCWpPLRkE");
        setField(term3506, term3506.getClass(), "argName", "nyiiPDVjAc");
        setField(term3506, term3506.getClass(), "description", "aKnKipADSo");
        setBooleanField(term3506, term3506.getClass(), "required", true);
        setBooleanField(term3506, term3506.getClass(), "optionalArg", true);
        setIntField(term3506, term3506.getClass(), "numberOfArgs", -655067527);
        setField(term3506, term3506.getClass(), "type", term3558);
        setField(term3506, term3506.getClass(), "values", term3559);
        setCharField(term3506, term3506.getClass(), "valuesep", 'E');
        term3564 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("org.apache.commons.cli.Option");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term3474;
        args[1] = term3506;
        args[2] = term3564;
        callMethod(klass, "appendOption", argTypes, term3442, args);
    }

};


