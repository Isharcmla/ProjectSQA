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

public class DefaultParser_parse_16712595025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term106;
     Object term126;
     Object term4965;
     Object term4987;
     Object term4994;
     Object term4743;

    public DefaultParser_parse_16712595025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term3 = new LinkedList();
        ArrayList term6 = new ArrayList();
        HashMap term11 = new HashMap();
        HashMap term16 = new HashMap();
        ArrayList term21 = new ArrayList();
        HashMap term25 = new HashMap();
        ArrayList term96 = new ArrayList();
        ArrayList term102 = new ArrayList();
        term1 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term2 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term10 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term43 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term95 = newInstance(Class.forName("java.lang.Object"));
        setField(term2, term2.getClass(), "args", term3);
        setField(term2, term2.getClass(), "options", term6);
        setField(term1, term1.getClass(), "cmd", term2);
        setField(term10, term10.getClass(), "shortOpts", term11);
        setField(term10, term10.getClass(), "longOpts", term16);
        setField(term10, term10.getClass(), "requiredOpts", term21);
        setField(term10, term10.getClass(), "optionGroups", term25);
        setField(term1, term1.getClass(), "options", term10);
        setBooleanField(term1, term1.getClass(), "stopAtNonOption", false);
        setField(term1, term1.getClass(), "currentToken", "PAEBtnZtTD");
        setField(term43, term43.getClass(), "opt", "sjlJAEtRrb");
        setField(term43, term43.getClass(), "longOpt", "MuLcgQHgqz");
        setField(term43, term43.getClass(), "argName", "xxtlPwDYFs");
        setField(term43, term43.getClass(), "description", "jJCZpVmanW");
        setBooleanField(term43, term43.getClass(), "required", false);
        setBooleanField(term43, term43.getClass(), "optionalArg", false);
        setIntField(term43, term43.getClass(), "numberOfArgs", 568599855);
        setField(term43, term43.getClass(), "type", term95);
        setField(term43, term43.getClass(), "values", term96);
        setCharField(term43, term43.getClass(), "valuesep", 'P');
        setField(term1, term1.getClass(), "currentOption", term43);
        setBooleanField(term1, term1.getClass(), "skipParsing", false);
        setField(term1, term1.getClass(), "expectedOpts", term102);
        HashMap term107 = new HashMap();
        HashMap term112 = new HashMap();
        ArrayList term117 = new ArrayList();
        HashMap term121 = new HashMap();
        term106 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term106, term106.getClass(), "shortOpts", term107);
        setField(term106, term106.getClass(), "longOpts", term112);
        setField(term106, term106.getClass(), "requiredOpts", term117);
        setField(term106, term106.getClass(), "optionGroups", term121);
        term126 = (Object[]) newArray("java.lang.String", 3);
        setElement(term126, 0, "EGtDIRbSSb");
        setElement(term126, 1, "SzjVpOQTyS");
        setElement(term126, 2, "MjGYSRKTNF");
        LinkedList term4967 = new LinkedList();
        ((LinkedList) term4967).add("EGtDIRbSSb");
        ((LinkedList) term4967).add("");
        ((LinkedList) term4967).add((Object)null);
        ArrayList term4974 = new ArrayList();
        HashMap term4977 = new HashMap();
        HashMap term4978 = new HashMap();
        ArrayList term4979 = new ArrayList();
        HashMap term4981 = new HashMap();
        ArrayList term4985 = new ArrayList();
        term4965 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term4966 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term4976 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term4966, term4966.getClass(), "args", term4967);
        setField(term4966, term4966.getClass(), "options", term4974);
        setField(term4965, term4965.getClass(), "cmd", term4966);
        setField(term4976, term4976.getClass(), "shortOpts", term4977);
        setField(term4976, term4976.getClass(), "longOpts", term4978);
        setField(term4976, term4976.getClass(), "requiredOpts", term4979);
        setField(term4976, term4976.getClass(), "optionGroups", term4981);
        setField(term4965, term4965.getClass(), "options", term4976);
        setBooleanField(term4965, term4965.getClass(), "stopAtNonOption", false);
        setField(term4965, term4965.getClass(), "currentToken", "MjGYSRKTNF");
        setField(term4965, term4965.getClass(), "currentOption", null);
        setBooleanField(term4965, term4965.getClass(), "skipParsing", false);
        setField(term4965, term4965.getClass(), "expectedOpts", term4985);
        HashMap term4988 = new HashMap();
        HashMap term4989 = new HashMap();
        ArrayList term4990 = new ArrayList();
        HashMap term4992 = new HashMap();
        term4987 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term4987, term4987.getClass(), "shortOpts", term4988);
        setField(term4987, term4987.getClass(), "longOpts", term4989);
        setField(term4987, term4987.getClass(), "requiredOpts", term4990);
        setField(term4987, term4987.getClass(), "optionGroups", term4992);
        term4994 = (Object[]) newArray("java.lang.String", 3);
        setElement(term4994, 0, "EGtDIRbSSb");
        setElement(term4994, 1, "SzjVpOQTyS");
        setElement(term4994, 2, "MjGYSRKTNF");
        LinkedList term4744 = new LinkedList();
        ((LinkedList) term4744).add("EGtDIRbSSb");
        ((LinkedList) term4744).add("");
        ((LinkedList) term4744).add((Object)null);
        ArrayList term4763 = new ArrayList();
        term4743 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term4743, term4743.getClass(), "args", term4744);
        setField(term4743, term4743.getClass(), "options", term4763);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.cli.Options");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term106;
        args[1] = term126;
        Object retValue = callMethod(klass, "parse", argTypes, term1, args);
        assertTrue(recursiveEquals(term1, term4965));
        assertTrue(recursiveEquals(term106, term4987));
        assertTrue(recursiveEquals(term126, term4994));
        assertTrue(recursiveEquals(retValue, term4743));
    }

};


