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
import java.util.HashMap;
import java.util.ArrayList;

public class HelpFormatter_printHelp_20000580162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1079;
     Object term1123;
     Object term16226;
     Object term16242;

    public HelpFormatter_printHelp_20000580162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1079 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term1110 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term1079, term1079.getClass(), "defaultWidth", 74);
        setIntField(term1079, term1079.getClass(), "defaultLeftPad", 1);
        setIntField(term1079, term1079.getClass(), "defaultDescPad", 3);
        setField(term1079, term1079.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term1079, term1079.getClass(), "defaultNewLine", "\n");
        setField(term1079, term1079.getClass(), "defaultOptPrefix", "-");
        setField(term1079, term1079.getClass(), "defaultLongOptPrefix", "--");
        setField(term1079, term1079.getClass(), "longOptSeparator", " ");
        setField(term1079, term1079.getClass(), "defaultArgName", "arg");
        setField(term1079, term1079.getClass(), "optionComparator", term1110);
        HashMap term1124 = new HashMap();
        HashMap term1129 = new HashMap();
        ArrayList term1134 = new ArrayList();
        HashMap term1138 = new HashMap();
        term1123 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term1123, term1123.getClass(), "shortOpts", term1124);
        setField(term1123, term1123.getClass(), "longOpts", term1129);
        setField(term1123, term1123.getClass(), "requiredOpts", term1134);
        setField(term1123, term1123.getClass(), "optionGroups", term1138);
        term16226 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term16239 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term16226, term16226.getClass(), "defaultWidth", 74);
        setIntField(term16226, term16226.getClass(), "defaultLeftPad", 1);
        setIntField(term16226, term16226.getClass(), "defaultDescPad", 3);
        setField(term16226, term16226.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term16226, term16226.getClass(), "defaultNewLine", "\n");
        setField(term16226, term16226.getClass(), "defaultOptPrefix", "-");
        setField(term16226, term16226.getClass(), "defaultLongOptPrefix", "--");
        setField(term16226, term16226.getClass(), "longOptSeparator", " ");
        setField(term16226, term16226.getClass(), "defaultArgName", "arg");
        setField(term16226, term16226.getClass(), "optionComparator", term16239);
        HashMap term16243 = new HashMap();
        HashMap term16245 = new HashMap();
        ArrayList term16246 = new ArrayList();
        HashMap term16248 = new HashMap();
        term16242 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term16242, term16242.getClass(), "shortOpts", term16243);
        setField(term16242, term16242.getClass(), "longOpts", term16245);
        setField(term16242, term16242.getClass(), "requiredOpts", term16246);
        setField(term16242, term16242.getClass(), "optionGroups", term16248);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.cli.Options");
        Object[] args = new Object[2];
        args[0] = "SzjVpOQTyS";
        args[1] = term1123;
        callMethod(klass, "printHelp", argTypes, term1079, args);
        assertTrue(recursiveEquals(term1079, term16226));
        assertTrue(recursiveEquals(term1123, term16242));
    }

};


