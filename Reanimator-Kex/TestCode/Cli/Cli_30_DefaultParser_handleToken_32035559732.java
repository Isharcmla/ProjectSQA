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

public class DefaultParser_handleToken_32035559732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1672;
     Object term7962;

    public DefaultParser_handleToken_32035559732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term1674 = new LinkedList();
        ArrayList term1677 = new ArrayList();
        HashMap term1682 = new HashMap();
        HashMap term1687 = new HashMap();
        ArrayList term1692 = new ArrayList();
        HashMap term1696 = new HashMap();
        ArrayList term1767 = new ArrayList();
        ArrayList term1773 = new ArrayList();
        term1672 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term1673 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term1681 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term1714 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term1766 = newInstance(Class.forName("java.lang.Object"));
        setField(term1673, term1673.getClass(), "args", term1674);
        setField(term1673, term1673.getClass(), "options", term1677);
        setField(term1672, term1672.getClass(), "cmd", term1673);
        setField(term1681, term1681.getClass(), "shortOpts", term1682);
        setField(term1681, term1681.getClass(), "longOpts", term1687);
        setField(term1681, term1681.getClass(), "requiredOpts", term1692);
        setField(term1681, term1681.getClass(), "optionGroups", term1696);
        setField(term1672, term1672.getClass(), "options", term1681);
        setBooleanField(term1672, term1672.getClass(), "stopAtNonOption", true);
        setField(term1672, term1672.getClass(), "currentToken", "JDswTTCZHV");
        setField(term1714, term1714.getClass(), "opt", "onpbIeEKoi");
        setField(term1714, term1714.getClass(), "longOpt", "YRHGsAkhxb");
        setField(term1714, term1714.getClass(), "argName", "ffYhPOzlUs");
        setField(term1714, term1714.getClass(), "description", "MLqYREekMl");
        setBooleanField(term1714, term1714.getClass(), "required", true);
        setBooleanField(term1714, term1714.getClass(), "optionalArg", true);
        setIntField(term1714, term1714.getClass(), "numberOfArgs", -2038273078);
        setField(term1714, term1714.getClass(), "type", term1766);
        setField(term1714, term1714.getClass(), "values", term1767);
        setCharField(term1714, term1714.getClass(), "valuesep", 't');
        setField(term1672, term1672.getClass(), "currentOption", term1714);
        setBooleanField(term1672, term1672.getClass(), "skipParsing", true);
        setField(term1672, term1672.getClass(), "expectedOpts", term1773);
        LinkedList term7964 = new LinkedList();
        ((LinkedList) term7964).add("");
        ArrayList term7967 = new ArrayList();
        HashMap term7970 = new HashMap();
        HashMap term7971 = new HashMap();
        ArrayList term7972 = new ArrayList();
        HashMap term7974 = new HashMap();
        ArrayList term7987 = new ArrayList();
        ArrayList term7989 = new ArrayList();
        term7962 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term7963 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term7969 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term7977 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term7986 = newInstance(Class.forName("java.lang.Object"));
        setField(term7963, term7963.getClass(), "args", term7964);
        setField(term7963, term7963.getClass(), "options", term7967);
        setField(term7962, term7962.getClass(), "cmd", term7963);
        setField(term7969, term7969.getClass(), "shortOpts", term7970);
        setField(term7969, term7969.getClass(), "longOpts", term7971);
        setField(term7969, term7969.getClass(), "requiredOpts", term7972);
        setField(term7969, term7969.getClass(), "optionGroups", term7974);
        setField(term7962, term7962.getClass(), "options", term7969);
        setBooleanField(term7962, term7962.getClass(), "stopAtNonOption", true);
        setField(term7962, term7962.getClass(), "currentToken", "ytSBIKXogI");
        setField(term7977, term7977.getClass(), "opt", "onpbIeEKoi");
        setField(term7977, term7977.getClass(), "longOpt", "YRHGsAkhxb");
        setField(term7977, term7977.getClass(), "argName", "ffYhPOzlUs");
        setField(term7977, term7977.getClass(), "description", "MLqYREekMl");
        setBooleanField(term7977, term7977.getClass(), "required", true);
        setBooleanField(term7977, term7977.getClass(), "optionalArg", true);
        setIntField(term7977, term7977.getClass(), "numberOfArgs", -2038273078);
        setField(term7977, term7977.getClass(), "type", term7986);
        setField(term7977, term7977.getClass(), "values", term7987);
        setCharField(term7977, term7977.getClass(), "valuesep", 't');
        setField(term7962, term7962.getClass(), "currentOption", term7977);
        setBooleanField(term7962, term7962.getClass(), "skipParsing", true);
        setField(term7962, term7962.getClass(), "expectedOpts", term7989);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ytSBIKXogI";
        callMethod(klass, "handleToken", argTypes, term1672, args);
        assertTrue(recursiveEquals(term1672, term7962));
    }

};


