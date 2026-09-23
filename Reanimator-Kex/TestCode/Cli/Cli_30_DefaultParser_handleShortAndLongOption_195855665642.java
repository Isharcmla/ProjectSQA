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

public class DefaultParser_handleShortAndLongOption_195855665642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3442;
     Object term11653;

    public DefaultParser_handleShortAndLongOption_195855665642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term3444 = new LinkedList();
        ArrayList term3447 = new ArrayList();
        HashMap term3452 = new HashMap();
        HashMap term3457 = new HashMap();
        ArrayList term3462 = new ArrayList();
        HashMap term3466 = new HashMap();
        ArrayList term3537 = new ArrayList();
        ArrayList term3543 = new ArrayList();
        term3442 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term3443 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term3451 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term3484 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term3536 = newInstance(Class.forName("java.lang.Object"));
        setField(term3443, term3443.getClass(), "args", term3444);
        setField(term3443, term3443.getClass(), "options", term3447);
        setField(term3442, term3442.getClass(), "cmd", term3443);
        setField(term3451, term3451.getClass(), "shortOpts", term3452);
        setField(term3451, term3451.getClass(), "longOpts", term3457);
        setField(term3451, term3451.getClass(), "requiredOpts", term3462);
        setField(term3451, term3451.getClass(), "optionGroups", term3466);
        setField(term3442, term3442.getClass(), "options", term3451);
        setBooleanField(term3442, term3442.getClass(), "stopAtNonOption", false);
        setField(term3442, term3442.getClass(), "currentToken", "RYdKCNNMBR");
        setField(term3484, term3484.getClass(), "opt", "yGtHPyvYiQ");
        setField(term3484, term3484.getClass(), "longOpt", "MvRIxilFMJ");
        setField(term3484, term3484.getClass(), "argName", "iNwOJRBEjp");
        setField(term3484, term3484.getClass(), "description", "XylxrMBraH");
        setBooleanField(term3484, term3484.getClass(), "required", false);
        setBooleanField(term3484, term3484.getClass(), "optionalArg", false);
        setIntField(term3484, term3484.getClass(), "numberOfArgs", -1456670397);
        setField(term3484, term3484.getClass(), "type", term3536);
        setField(term3484, term3484.getClass(), "values", term3537);
        setCharField(term3484, term3484.getClass(), "valuesep", 'R');
        setField(term3442, term3442.getClass(), "currentOption", term3484);
        setBooleanField(term3442, term3442.getClass(), "skipParsing", false);
        setField(term3442, term3442.getClass(), "expectedOpts", term3543);
        LinkedList term11655 = new LinkedList();
        ((LinkedList) term11655).add("");
        ArrayList term11658 = new ArrayList();
        HashMap term11661 = new HashMap();
        HashMap term11662 = new HashMap();
        ArrayList term11664 = new ArrayList();
        HashMap term11666 = new HashMap();
        ArrayList term11679 = new ArrayList();
        ArrayList term11681 = new ArrayList();
        term11653 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term11654 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term11660 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term11669 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term11678 = newInstance(Class.forName("java.lang.Object"));
        setField(term11654, term11654.getClass(), "args", term11655);
        setField(term11654, term11654.getClass(), "options", term11658);
        setField(term11653, term11653.getClass(), "cmd", term11654);
        setField(term11660, term11660.getClass(), "shortOpts", term11661);
        setField(term11660, term11660.getClass(), "longOpts", term11662);
        setField(term11660, term11660.getClass(), "requiredOpts", term11664);
        setField(term11660, term11660.getClass(), "optionGroups", term11666);
        setField(term11653, term11653.getClass(), "options", term11660);
        setBooleanField(term11653, term11653.getClass(), "stopAtNonOption", false);
        setField(term11653, term11653.getClass(), "currentToken", "RYdKCNNMBR");
        setField(term11669, term11669.getClass(), "opt", "yGtHPyvYiQ");
        setField(term11669, term11669.getClass(), "longOpt", "MvRIxilFMJ");
        setField(term11669, term11669.getClass(), "argName", "iNwOJRBEjp");
        setField(term11669, term11669.getClass(), "description", "XylxrMBraH");
        setBooleanField(term11669, term11669.getClass(), "required", false);
        setBooleanField(term11669, term11669.getClass(), "optionalArg", false);
        setIntField(term11669, term11669.getClass(), "numberOfArgs", -1456670397);
        setField(term11669, term11669.getClass(), "type", term11678);
        setField(term11669, term11669.getClass(), "values", term11679);
        setCharField(term11669, term11669.getClass(), "valuesep", 'R');
        setField(term11653, term11653.getClass(), "currentOption", term11669);
        setBooleanField(term11653, term11653.getClass(), "skipParsing", false);
        setField(term11653, term11653.getClass(), "expectedOpts", term11681);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pORebkoRdD";
        callMethod(klass, "handleShortAndLongOption", argTypes, term3442, args);
        assertTrue(recursiveEquals(term3442, term11653));
    }

};


