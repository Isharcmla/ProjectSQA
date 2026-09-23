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
import java.lang.Integer;
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Boolean;

public class HelpFormatter_printHelp_110574461726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1662;
     Object term1694;
     Object term1720;
     Object term1752;

    public HelpFormatter_printHelp_110574461726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1662 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term1693 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term1662, term1662.getClass(), "defaultWidth", 74);
        setIntField(term1662, term1662.getClass(), "defaultLeftPad", 1);
        setIntField(term1662, term1662.getClass(), "defaultDescPad", 3);
        setField(term1662, term1662.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term1662, term1662.getClass(), "defaultNewLine", "\n");
        setField(term1662, term1662.getClass(), "defaultOptPrefix", "-");
        setField(term1662, term1662.getClass(), "defaultLongOptPrefix", "--");
        setField(term1662, term1662.getClass(), "longOptSeparator", " ");
        setField(term1662, term1662.getClass(), "defaultArgName", "arg");
        setField(term1662, term1662.getClass(), "optionComparator", term1693);
        term1694 = new Integer(-1922583790);
        HashMap term1721 = new HashMap();
        HashMap term1726 = new HashMap();
        ArrayList term1731 = new ArrayList();
        HashMap term1735 = new HashMap();
        term1720 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term1720, term1720.getClass(), "shortOpts", term1721);
        setField(term1720, term1720.getClass(), "longOpts", term1726);
        setField(term1720, term1720.getClass(), "requiredOpts", term1731);
        setField(term1720, term1720.getClass(), "optionGroups", term1735);
        term1752 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("org.apache.commons.cli.Options");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = boolean.class;
        Object[] args = new Object[6];
        args[0] = term1694;
        args[1] = "tbcdzjIfER";
        args[2] = "HyxfbSQYBe";
        args[3] = term1720;
        args[4] = "pCTimMblYc";
        args[5] = term1752;
        callMethod(klass, "printHelp", argTypes, term1662, args);
    }

};


