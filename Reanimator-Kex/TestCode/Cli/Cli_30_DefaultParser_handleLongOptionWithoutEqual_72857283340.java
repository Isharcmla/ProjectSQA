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
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.HashMap;

public class DefaultParser_handleLongOptionWithoutEqual_72857283340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3088;
     Object term10526;

    public DefaultParser_handleLongOptionWithoutEqual_72857283340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term3090 = new LinkedList();
        ArrayList term3093 = new ArrayList();
        HashMap term3098 = new HashMap();
        HashMap term3103 = new HashMap();
        ArrayList term3108 = new ArrayList();
        HashMap term3112 = new HashMap();
        ArrayList term3183 = new ArrayList();
        ArrayList term3189 = new ArrayList();
        term3088 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term3089 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term3097 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term3130 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term3182 = newInstance(Class.forName("java.lang.Object"));
        setField(term3089, term3089.getClass(), "args", term3090);
        setField(term3089, term3089.getClass(), "options", term3093);
        setField(term3088, term3088.getClass(), "cmd", term3089);
        setField(term3097, term3097.getClass(), "shortOpts", term3098);
        setField(term3097, term3097.getClass(), "longOpts", term3103);
        setField(term3097, term3097.getClass(), "requiredOpts", term3108);
        setField(term3097, term3097.getClass(), "optionGroups", term3112);
        setField(term3088, term3088.getClass(), "options", term3097);
        setBooleanField(term3088, term3088.getClass(), "stopAtNonOption", true);
        setField(term3088, term3088.getClass(), "currentToken", "sEccwbJKYE");
        setField(term3130, term3130.getClass(), "opt", "AWRooQKkdW");
        setField(term3130, term3130.getClass(), "longOpt", "vjxIhXHxGR");
        setField(term3130, term3130.getClass(), "argName", "QXzGXbEXMu");
        setField(term3130, term3130.getClass(), "description", "qxSDVejjiY");
        setBooleanField(term3130, term3130.getClass(), "required", true);
        setBooleanField(term3130, term3130.getClass(), "optionalArg", false);
        setIntField(term3130, term3130.getClass(), "numberOfArgs", 597278769);
        setField(term3130, term3130.getClass(), "type", term3182);
        setField(term3130, term3130.getClass(), "values", term3183);
        setCharField(term3130, term3130.getClass(), "valuesep", 'E');
        setField(term3088, term3088.getClass(), "currentOption", term3130);
        setBooleanField(term3088, term3088.getClass(), "skipParsing", false);
        setField(term3088, term3088.getClass(), "expectedOpts", term3189);
        LinkedList term10528 = new LinkedList();
        ((LinkedList) term10528).add("");
        ArrayList term10531 = new ArrayList();
        HashMap term10534 = new HashMap();
        HashMap term10535 = new HashMap();
        ArrayList term10537 = new ArrayList();
        HashMap term10539 = new HashMap();
        ArrayList term10552 = new ArrayList();
        ArrayList term10554 = new ArrayList();
        term10526 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term10527 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term10533 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term10542 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term10551 = newInstance(Class.forName("java.lang.Object"));
        setField(term10527, term10527.getClass(), "args", term10528);
        setField(term10527, term10527.getClass(), "options", term10531);
        setField(term10526, term10526.getClass(), "cmd", term10527);
        setField(term10533, term10533.getClass(), "shortOpts", term10534);
        setField(term10533, term10533.getClass(), "longOpts", term10535);
        setField(term10533, term10533.getClass(), "requiredOpts", term10537);
        setField(term10533, term10533.getClass(), "optionGroups", term10539);
        setField(term10526, term10526.getClass(), "options", term10533);
        setBooleanField(term10526, term10526.getClass(), "stopAtNonOption", true);
        setField(term10526, term10526.getClass(), "currentToken", "sEccwbJKYE");
        setField(term10542, term10542.getClass(), "opt", "AWRooQKkdW");
        setField(term10542, term10542.getClass(), "longOpt", "vjxIhXHxGR");
        setField(term10542, term10542.getClass(), "argName", "QXzGXbEXMu");
        setField(term10542, term10542.getClass(), "description", "qxSDVejjiY");
        setBooleanField(term10542, term10542.getClass(), "required", true);
        setBooleanField(term10542, term10542.getClass(), "optionalArg", false);
        setIntField(term10542, term10542.getClass(), "numberOfArgs", 597278769);
        setField(term10542, term10542.getClass(), "type", term10551);
        setField(term10542, term10542.getClass(), "values", term10552);
        setCharField(term10542, term10542.getClass(), "valuesep", 'E');
        setField(term10526, term10526.getClass(), "currentOption", term10542);
        setBooleanField(term10526, term10526.getClass(), "skipParsing", true);
        setField(term10526, term10526.getClass(), "expectedOpts", term10554);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xBsXSDjXYK";
        callMethod(klass, "handleLongOptionWithoutEqual", argTypes, term3088, args);
        assertTrue(recursiveEquals(term3088, term10526));
    }

};


