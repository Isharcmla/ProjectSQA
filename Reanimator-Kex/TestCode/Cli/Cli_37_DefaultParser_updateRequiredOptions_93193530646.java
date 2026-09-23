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
import java.util.LinkedHashMap;

public class DefaultParser_updateRequiredOptions_93193530646 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4464;
     Object term4572;
     Object term14780;
     Object term14807;

    public DefaultParser_updateRequiredOptions_93193530646() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term4466 = new LinkedList();
        ArrayList term4469 = new ArrayList();
        LinkedHashMap term4474 = new LinkedHashMap();
        LinkedHashMap term4480 = new LinkedHashMap();
        ArrayList term4486 = new ArrayList();
        LinkedHashMap term4490 = new LinkedHashMap();
        ArrayList term4561 = new ArrayList();
        ((ArrayList) term4561).add("");
        ArrayList term4568 = new ArrayList();
        term4464 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term4465 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term4473 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term4509 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term4465, term4465.getClass(), "args", term4466);
        setField(term4465, term4465.getClass(), "options", term4469);
        setField(term4464, term4464.getClass(), "cmd", term4465);
        setField(term4473, term4473.getClass(), "shortOpts", term4474);
        setField(term4473, term4473.getClass(), "longOpts", term4480);
        setField(term4473, term4473.getClass(), "requiredOpts", term4486);
        setField(term4473, term4473.getClass(), "optionGroups", term4490);
        setField(term4464, term4464.getClass(), "options", term4473);
        setBooleanField(term4464, term4464.getClass(), "stopAtNonOption", false);
        setField(term4464, term4464.getClass(), "currentToken", "HDaezxQfQR");
        setField(term4509, term4509.getClass(), "opt", "iikZEapDlu");
        setField(term4509, term4509.getClass(), "longOpt", "nhoHrZfnIN");
        setField(term4509, term4509.getClass(), "argName", "ZkMALXpEAZ");
        setField(term4509, term4509.getClass(), "description", "tXfQjSqDzN");
        setBooleanField(term4509, term4509.getClass(), "required", true);
        setBooleanField(term4509, term4509.getClass(), "optionalArg", true);
        setIntField(term4509, term4509.getClass(), "numberOfArgs", -2068769794);
        setField(term4509, term4509.getClass(), "type", null);
        setField(term4509, term4509.getClass(), "values", term4561);
        setCharField(term4509, term4509.getClass(), "valuesep", 'L');
        setField(term4464, term4464.getClass(), "currentOption", term4509);
        setBooleanField(term4464, term4464.getClass(), "skipParsing", true);
        setField(term4464, term4464.getClass(), "expectedOpts", term4568);
        ArrayList term4624 = new ArrayList();
        ((ArrayList) term4624).add("FwPbDZcHmB");
        ((ArrayList) term4624).add("hOncybyCAH");
        ((ArrayList) term4624).add("QduALnDSVo");
        ((ArrayList) term4624).add("izPpKDErnQ");
        ((ArrayList) term4624).add("NnpwZBUTvx");
        ((ArrayList) term4624).add("tlQSNgTkQX");
        ((ArrayList) term4624).add("PCipZnmBOF");
        term4572 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term4572, term4572.getClass(), "opt", "vGiuZVPJNH");
        setField(term4572, term4572.getClass(), "longOpt", "tlzpzIjMib");
        setField(term4572, term4572.getClass(), "argName", "AZdLeSugwv");
        setField(term4572, term4572.getClass(), "description", "RMsXuyzKJV");
        setBooleanField(term4572, term4572.getClass(), "required", true);
        setBooleanField(term4572, term4572.getClass(), "optionalArg", true);
        setIntField(term4572, term4572.getClass(), "numberOfArgs", -117576464);
        setField(term4572, term4572.getClass(), "type", null);
        setField(term4572, term4572.getClass(), "values", term4624);
        setCharField(term4572, term4572.getClass(), "valuesep", 'c');
        LinkedList term14782 = new LinkedList();
        ArrayList term14783 = new ArrayList();
        LinkedHashMap term14786 = new LinkedHashMap();
        LinkedHashMap term14787 = new LinkedHashMap();
        ArrayList term14788 = new ArrayList();
        LinkedHashMap term14790 = new LinkedHashMap();
        ArrayList term14802 = new ArrayList();
        ((ArrayList) term14802).add("");
        ArrayList term14805 = new ArrayList();
        term14780 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term14781 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term14785 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term14793 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term14781, term14781.getClass(), "args", term14782);
        setField(term14781, term14781.getClass(), "options", term14783);
        setField(term14780, term14780.getClass(), "cmd", term14781);
        setField(term14785, term14785.getClass(), "shortOpts", term14786);
        setField(term14785, term14785.getClass(), "longOpts", term14787);
        setField(term14785, term14785.getClass(), "requiredOpts", term14788);
        setField(term14785, term14785.getClass(), "optionGroups", term14790);
        setField(term14780, term14780.getClass(), "options", term14785);
        setBooleanField(term14780, term14780.getClass(), "stopAtNonOption", false);
        setField(term14780, term14780.getClass(), "currentToken", "HDaezxQfQR");
        setField(term14793, term14793.getClass(), "opt", "iikZEapDlu");
        setField(term14793, term14793.getClass(), "longOpt", "nhoHrZfnIN");
        setField(term14793, term14793.getClass(), "argName", "ZkMALXpEAZ");
        setField(term14793, term14793.getClass(), "description", "tXfQjSqDzN");
        setBooleanField(term14793, term14793.getClass(), "required", true);
        setBooleanField(term14793, term14793.getClass(), "optionalArg", true);
        setIntField(term14793, term14793.getClass(), "numberOfArgs", -2068769794);
        setField(term14793, term14793.getClass(), "type", null);
        setField(term14793, term14793.getClass(), "values", term14802);
        setCharField(term14793, term14793.getClass(), "valuesep", 'L');
        setField(term14780, term14780.getClass(), "currentOption", term14793);
        setBooleanField(term14780, term14780.getClass(), "skipParsing", true);
        setField(term14780, term14780.getClass(), "expectedOpts", term14805);
        ArrayList term14816 = new ArrayList();
        ((ArrayList) term14816).add("FwPbDZcHmB");
        ((ArrayList) term14816).add("hOncybyCAH");
        ((ArrayList) term14816).add("QduALnDSVo");
        ((ArrayList) term14816).add("izPpKDErnQ");
        ((ArrayList) term14816).add("NnpwZBUTvx");
        ((ArrayList) term14816).add("tlQSNgTkQX");
        ((ArrayList) term14816).add("PCipZnmBOF");
        term14807 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term14807, term14807.getClass(), "opt", "vGiuZVPJNH");
        setField(term14807, term14807.getClass(), "longOpt", "tlzpzIjMib");
        setField(term14807, term14807.getClass(), "argName", "AZdLeSugwv");
        setField(term14807, term14807.getClass(), "description", "RMsXuyzKJV");
        setBooleanField(term14807, term14807.getClass(), "required", true);
        setBooleanField(term14807, term14807.getClass(), "optionalArg", true);
        setIntField(term14807, term14807.getClass(), "numberOfArgs", -117576464);
        setField(term14807, term14807.getClass(), "type", null);
        setField(term14807, term14807.getClass(), "values", term14816);
        setCharField(term14807, term14807.getClass(), "valuesep", 'c');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term4572;
        callMethod(klass, "updateRequiredOptions", argTypes, term4464, args);
        assertTrue(recursiveEquals(term4464, term14780));
        assertTrue(recursiveEquals(term4572, term14807));
    }

};


