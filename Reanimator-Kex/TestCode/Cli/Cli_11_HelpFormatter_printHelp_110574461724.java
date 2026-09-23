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

public class HelpFormatter_printHelp_110574461724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1454;
     Object term1483;
     Object term1509;
     Object term1541;

    public HelpFormatter_printHelp_110574461724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1454 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term1482 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term1454, term1454.getClass(), "defaultWidth", 74);
        setIntField(term1454, term1454.getClass(), "defaultLeftPad", 1);
        setIntField(term1454, term1454.getClass(), "defaultDescPad", 3);
        setField(term1454, term1454.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term1454, term1454.getClass(), "defaultNewLine", "\n");
        setField(term1454, term1454.getClass(), "defaultOptPrefix", "-");
        setField(term1454, term1454.getClass(), "defaultLongOptPrefix", "--");
        setField(term1454, term1454.getClass(), "defaultArgName", "arg");
        setField(term1454, term1454.getClass(), "optionComparator", term1482);
        term1483 = new Integer(-1922583790);
        HashMap term1510 = new HashMap();
        HashMap term1515 = new HashMap();
        ArrayList term1520 = new ArrayList();
        HashMap term1524 = new HashMap();
        term1509 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term1509, term1509.getClass(), "shortOpts", term1510);
        setField(term1509, term1509.getClass(), "longOpts", term1515);
        setField(term1509, term1509.getClass(), "requiredOpts", term1520);
        setField(term1509, term1509.getClass(), "optionGroups", term1524);
        term1541 = new Boolean(false);
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
        args[0] = term1483;
        args[1] = "ZiaGIbnzTs";
        args[2] = "tbcdzjIfER";
        args[3] = term1509;
        args[4] = "HyxfbSQYBe";
        args[5] = term1541;
        callMethod(klass, "printHelp", argTypes, term1454, args);
    }

};


