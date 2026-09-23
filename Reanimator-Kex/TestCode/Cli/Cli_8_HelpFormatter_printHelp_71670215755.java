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
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Boolean;

public class HelpFormatter_printHelp_71670215755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term873;
     Object term913;
     Object term933;
     Object term23717;
     Object term23730;

    public HelpFormatter_printHelp_71670215755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term873 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term873, term873.getClass(), "defaultWidth", 74);
        setIntField(term873, term873.getClass(), "defaultLeftPad", 1);
        setIntField(term873, term873.getClass(), "defaultDescPad", 3);
        setField(term873, term873.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term873, term873.getClass(), "defaultNewLine", "\n");
        setField(term873, term873.getClass(), "defaultOptPrefix", "-");
        setField(term873, term873.getClass(), "defaultLongOptPrefix", "--");
        setField(term873, term873.getClass(), "defaultArgName", "arg");
        HashMap term914 = new HashMap();
        HashMap term919 = new HashMap();
        ArrayList term924 = new ArrayList();
        HashMap term928 = new HashMap();
        term913 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term913, term913.getClass(), "shortOpts", term914);
        setField(term913, term913.getClass(), "longOpts", term919);
        setField(term913, term913.getClass(), "requiredOpts", term924);
        setField(term913, term913.getClass(), "optionGroups", term928);
        term933 = new Boolean(false);
        term23717 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term23717, term23717.getClass(), "defaultWidth", 74);
        setIntField(term23717, term23717.getClass(), "defaultLeftPad", 1);
        setIntField(term23717, term23717.getClass(), "defaultDescPad", 3);
        setField(term23717, term23717.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term23717, term23717.getClass(), "defaultNewLine", "\n");
        setField(term23717, term23717.getClass(), "defaultOptPrefix", "-");
        setField(term23717, term23717.getClass(), "defaultLongOptPrefix", "--");
        setField(term23717, term23717.getClass(), "defaultArgName", "arg");
        HashMap term23731 = new HashMap();
        HashMap term23733 = new HashMap();
        ArrayList term23735 = new ArrayList();
        HashMap term23737 = new HashMap();
        term23730 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term23730, term23730.getClass(), "shortOpts", term23731);
        setField(term23730, term23730.getClass(), "longOpts", term23733);
        setField(term23730, term23730.getClass(), "requiredOpts", term23735);
        setField(term23730, term23730.getClass(), "optionGroups", term23737);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.cli.Options");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = "SzjVpOQTyS";
        args[1] = term913;
        args[2] = term933;
        callMethod(klass, "printHelp", argTypes, term873, args);
        assertTrue(recursiveEquals(term873, term23717));
        assertTrue(recursiveEquals(term913, term23730));
        assertTrue(recursiveEquals(term933, false));
    }

};


