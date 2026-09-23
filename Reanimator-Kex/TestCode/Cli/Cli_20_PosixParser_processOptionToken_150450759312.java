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
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;
import java.util.LinkedList;
import java.lang.Boolean;

public class PosixParser_processOptionToken_150450759312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term692;
     Object term820;
     Object term2033;

    public PosixParser_processOptionToken_150450759312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term693 = new ArrayList();
        ArrayList term751 = new ArrayList();
        HashMap term785 = new HashMap();
        HashMap term790 = new HashMap();
        ArrayList term795 = new ArrayList();
        HashMap term799 = new HashMap();
        LinkedList term777 = new LinkedList();
        ArrayList term780 = new ArrayList();
        ArrayList term804 = new ArrayList();
        term692 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term698 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term750 = newInstance(Class.forName("java.lang.Object"));
        Object term784 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term776 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term692, term692.getClass(), "tokens", term693);
        setBooleanField(term692, term692.getClass(), "eatTheRest", true);
        setField(term698, term698.getClass(), "opt", "HyxfbSQYBe");
        setField(term698, term698.getClass(), "longOpt", "pCTimMblYc");
        setField(term698, term698.getClass(), "argName", "hNxWaHcfhY");
        setField(term698, term698.getClass(), "description", "RkybSrpybU");
        setBooleanField(term698, term698.getClass(), "required", false);
        setBooleanField(term698, term698.getClass(), "optionalArg", false);
        setIntField(term698, term698.getClass(), "numberOfArgs", -1922583790);
        setField(term698, term698.getClass(), "type", term750);
        setField(term698, term698.getClass(), "values", term751);
        setCharField(term698, term698.getClass(), "valuesep", 't');
        setField(term692, term692.getClass(), "currentOption", term698);
        setField(term784, term784.getClass(), "shortOpts", term785);
        setField(term784, term784.getClass(), "longOpts", term790);
        setField(term784, term784.getClass(), "requiredOpts", term795);
        setField(term784, term784.getClass(), "optionGroups", term799);
        setField(term692, term692.getClass(), "options", term784);
        setField(term776, term776.getClass(), "args", term777);
        setField(term776, term776.getClass(), "options", term780);
        setField(term692, term692.getClass(), "cmd", term776);
        setField(term692, term692.getClass(), "requiredOptions", term804);
        term820 = new Boolean(true);
        ArrayList term2034 = new ArrayList();
        ((ArrayList) term2034).add("xOEqzGAmDU");
        ArrayList term2048 = new ArrayList();
        LinkedList term2051 = new LinkedList();
        ArrayList term2052 = new ArrayList();
        ArrayList term2054 = new ArrayList();
        term2033 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term2038 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term2047 = newInstance(Class.forName("java.lang.Object"));
        Object term2050 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term2033, term2033.getClass(), "tokens", term2034);
        setBooleanField(term2033, term2033.getClass(), "eatTheRest", true);
        setField(term2038, term2038.getClass(), "opt", "HyxfbSQYBe");
        setField(term2038, term2038.getClass(), "longOpt", "pCTimMblYc");
        setField(term2038, term2038.getClass(), "argName", "hNxWaHcfhY");
        setField(term2038, term2038.getClass(), "description", "RkybSrpybU");
        setBooleanField(term2038, term2038.getClass(), "required", false);
        setBooleanField(term2038, term2038.getClass(), "optionalArg", false);
        setIntField(term2038, term2038.getClass(), "numberOfArgs", -1922583790);
        setField(term2038, term2038.getClass(), "type", term2047);
        setField(term2038, term2038.getClass(), "values", term2048);
        setCharField(term2038, term2038.getClass(), "valuesep", 't');
        setField(term2033, term2033.getClass(), "currentOption", term2038);
        setField(term2033, term2033.getClass(), "options", null);
        setField(term2050, term2050.getClass(), "args", term2051);
        setField(term2050, term2050.getClass(), "options", term2052);
        setField(term2033, term2033.getClass(), "cmd", term2050);
        setField(term2033, term2033.getClass(), "requiredOptions", term2054);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "xOEqzGAmDU";
        args[1] = term820;
        callMethod(klass, "processOptionToken", argTypes, term692, args);
        assertTrue(recursiveEquals(term692, term2033));
        assertTrue(recursiveEquals(term820, true));
    }

};


