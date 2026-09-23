package org.apache.commons.math.optimization.linear;

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
import java.lang.NullPointerException;
import static org.apache.commons.math.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;

public class SimplexTableau_getEntry_108179920250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10059;
     Object term10160;
     Object term10162;

    public SimplexTableau_getEntry_108179920250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term10062 = new ArrayList();
        ArrayList term10067 = new ArrayList();
        ((ArrayList) term10067).add("UoYtihxVaS");
        ((ArrayList) term10067).add("JDswTTCZHV");
        ((ArrayList) term10067).add("onpbIeEKoi");
        ((ArrayList) term10067).add("YRHGsAkhxb");
        ((ArrayList) term10067).add("ffYhPOzlUs");
        ((ArrayList) term10067).add("MLqYREekMl");
        ((ArrayList) term10067).add("ytSBIKXogI");
        term10059 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term10060 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term10060, term10060.getClass(), "coefficients", null);
        setDoubleField(term10060, term10060.getClass(), "constantTerm", 0.39446728256884744);
        setField(term10059, term10059.getClass(), "f", term10060);
        setField(term10059, term10059.getClass(), "constraints", term10062);
        setBooleanField(term10059, term10059.getClass(), "restrictToNonNegative", true);
        setField(term10059, term10059.getClass(), "columnLabels", term10067);
        setField(term10059, term10059.getClass(), "tableau", null);
        setIntField(term10059, term10059.getClass(), "numDecisionVariables", 458147407);
        setIntField(term10059, term10059.getClass(), "numSlackVariables", -184153539);
        setIntField(term10059, term10059.getClass(), "numArtificialVariables", 493620644);
        setDoubleField(term10059, term10059.getClass(), "epsilon", 0.7865909711092062);
        setIntField(term10059, term10059.getClass(), "maxUlps", 1328271830);
        term10160 = new Integer(1596070772);
        term10162 = new Integer(97029295);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term10160;
        args[1] = term10162;
        try {
            callMethod(klass, "getEntry", argTypes, term10059, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


