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
     Object term15025;
     Object term15052;

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
        LinkedList term15027 = new LinkedList();
        ArrayList term15028 = new ArrayList();
        LinkedHashMap term15031 = new LinkedHashMap();
        LinkedHashMap term15032 = new LinkedHashMap();
        ArrayList term15033 = new ArrayList();
        LinkedHashMap term15035 = new LinkedHashMap();
        ArrayList term15047 = new ArrayList();
        ((ArrayList) term15047).add("");
        ArrayList term15050 = new ArrayList();
        term15025 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term15026 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term15030 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term15038 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term15026, term15026.getClass(), "args", term15027);
        setField(term15026, term15026.getClass(), "options", term15028);
        setField(term15025, term15025.getClass(), "cmd", term15026);
        setField(term15030, term15030.getClass(), "shortOpts", term15031);
        setField(term15030, term15030.getClass(), "longOpts", term15032);
        setField(term15030, term15030.getClass(), "requiredOpts", term15033);
        setField(term15030, term15030.getClass(), "optionGroups", term15035);
        setField(term15025, term15025.getClass(), "options", term15030);
        setBooleanField(term15025, term15025.getClass(), "stopAtNonOption", false);
        setField(term15025, term15025.getClass(), "currentToken", "HDaezxQfQR");
        setField(term15038, term15038.getClass(), "opt", "iikZEapDlu");
        setField(term15038, term15038.getClass(), "longOpt", "nhoHrZfnIN");
        setField(term15038, term15038.getClass(), "argName", "ZkMALXpEAZ");
        setField(term15038, term15038.getClass(), "description", "tXfQjSqDzN");
        setBooleanField(term15038, term15038.getClass(), "required", true);
        setBooleanField(term15038, term15038.getClass(), "optionalArg", true);
        setIntField(term15038, term15038.getClass(), "numberOfArgs", -2068769794);
        setField(term15038, term15038.getClass(), "type", null);
        setField(term15038, term15038.getClass(), "values", term15047);
        setCharField(term15038, term15038.getClass(), "valuesep", 'L');
        setField(term15025, term15025.getClass(), "currentOption", term15038);
        setBooleanField(term15025, term15025.getClass(), "skipParsing", true);
        setField(term15025, term15025.getClass(), "expectedOpts", term15050);
        ArrayList term15061 = new ArrayList();
        ((ArrayList) term15061).add("FwPbDZcHmB");
        ((ArrayList) term15061).add("hOncybyCAH");
        ((ArrayList) term15061).add("QduALnDSVo");
        ((ArrayList) term15061).add("izPpKDErnQ");
        ((ArrayList) term15061).add("NnpwZBUTvx");
        ((ArrayList) term15061).add("tlQSNgTkQX");
        ((ArrayList) term15061).add("PCipZnmBOF");
        term15052 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term15052, term15052.getClass(), "opt", "vGiuZVPJNH");
        setField(term15052, term15052.getClass(), "longOpt", "tlzpzIjMib");
        setField(term15052, term15052.getClass(), "argName", "AZdLeSugwv");
        setField(term15052, term15052.getClass(), "description", "RMsXuyzKJV");
        setBooleanField(term15052, term15052.getClass(), "required", true);
        setBooleanField(term15052, term15052.getClass(), "optionalArg", true);
        setIntField(term15052, term15052.getClass(), "numberOfArgs", -117576464);
        setField(term15052, term15052.getClass(), "type", null);
        setField(term15052, term15052.getClass(), "values", term15061);
        setCharField(term15052, term15052.getClass(), "valuesep", 'c');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term4572;
        callMethod(klass, "updateRequiredOptions", argTypes, term4464, args);
        assertTrue(recursiveEquals(term4464, term15025));
        assertTrue(recursiveEquals(term4572, term15052));
    }

};


