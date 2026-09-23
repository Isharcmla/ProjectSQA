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
     Object term16232;
     Object term16248;

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
        term16232 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term16245 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term16232, term16232.getClass(), "defaultWidth", 74);
        setIntField(term16232, term16232.getClass(), "defaultLeftPad", 1);
        setIntField(term16232, term16232.getClass(), "defaultDescPad", 3);
        setField(term16232, term16232.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term16232, term16232.getClass(), "defaultNewLine", "\n");
        setField(term16232, term16232.getClass(), "defaultOptPrefix", "-");
        setField(term16232, term16232.getClass(), "defaultLongOptPrefix", "--");
        setField(term16232, term16232.getClass(), "longOptSeparator", " ");
        setField(term16232, term16232.getClass(), "defaultArgName", "arg");
        setField(term16232, term16232.getClass(), "optionComparator", term16245);
        HashMap term16249 = new HashMap();
        HashMap term16251 = new HashMap();
        ArrayList term16252 = new ArrayList();
        HashMap term16254 = new HashMap();
        term16248 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term16248, term16248.getClass(), "shortOpts", term16249);
        setField(term16248, term16248.getClass(), "longOpts", term16251);
        setField(term16248, term16248.getClass(), "requiredOpts", term16252);
        setField(term16248, term16248.getClass(), "optionGroups", term16254);
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
        assertTrue(recursiveEquals(term1079, term16232));
        assertTrue(recursiveEquals(term1123, term16248));
    }

};


