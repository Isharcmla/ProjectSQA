package com.google.javascript.jscomp;

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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_newCallNode_447342869306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4611;
     Object term4638;

    public NodeUtil_newCallNode_447342869306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4611 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4613 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4615 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4619 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4622 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4628 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4633 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4611, term4611.getClass(), "type", -1603460382);
        setIntField(term4613, term4613.getClass(), "type", -298939768);
        setIntField(term4615, term4615.getClass(), "type", -767031634);
        setIntField(term4617, term4617.getClass(), "type", -2072469750);
        setIntField(term4619, term4619.getClass(), "type", 2106616847);
        setField(term4619, term4619.getClass(), "next", null);
        setField(term4619, term4619.getClass(), "first", null);
        setField(term4619, term4619.getClass(), "last", null);
        setField(term4619, term4619.getClass(), "propListHead", null);
        setIntField(term4619, term4619.getClass(), "sourcePosition", 0);
        setField(term4619, term4619.getClass(), "jsType", null);
        setField(term4619, term4619.getClass(), "parent", null);
        setField(term4617, term4617.getClass(), "next", term4619);
        setIntField(term4622, term4622.getClass(), "type", 403107947);
        setField(term4622, term4622.getClass(), "next", null);
        setField(term4622, term4622.getClass(), "first", null);
        setField(term4622, term4622.getClass(), "last", term4619);
        setField(term4622, term4622.getClass(), "propListHead", null);
        setIntField(term4622, term4622.getClass(), "sourcePosition", 0);
        setField(term4622, term4622.getClass(), "jsType", null);
        setField(term4622, term4622.getClass(), "parent", null);
        setField(term4617, term4617.getClass(), "first", term4622);
        setField(term4617, term4617.getClass(), "last", term4615);
        setField(term4617, term4617.getClass(), "propListHead", null);
        setIntField(term4617, term4617.getClass(), "sourcePosition", 0);
        setField(term4617, term4617.getClass(), "jsType", null);
        setField(term4617, term4617.getClass(), "parent", null);
        setField(term4615, term4615.getClass(), "next", term4617);
        setField(term4615, term4615.getClass(), "first", term4619);
        setIntField(term4626, term4626.getClass(), "type", -1445089135);
        setIntField(term4628, term4628.getClass(), "type", -291618851);
        setField(term4628, term4628.getClass(), "next", null);
        setField(term4628, term4628.getClass(), "first", term4622);
        setField(term4628, term4628.getClass(), "last", term4617);
        setField(term4628, term4628.getClass(), "propListHead", null);
        setIntField(term4628, term4628.getClass(), "sourcePosition", 0);
        setField(term4628, term4628.getClass(), "jsType", null);
        setField(term4628, term4628.getClass(), "parent", null);
        setField(term4626, term4626.getClass(), "next", term4628);
        setField(term4626, term4626.getClass(), "first", term4613);
        setField(term4626, term4626.getClass(), "last", term4613);
        setField(term4626, term4626.getClass(), "propListHead", null);
        setIntField(term4626, term4626.getClass(), "sourcePosition", 0);
        setField(term4626, term4626.getClass(), "jsType", null);
        setField(term4626, term4626.getClass(), "parent", null);
        setField(term4615, term4615.getClass(), "last", term4626);
        setField(term4615, term4615.getClass(), "propListHead", null);
        setIntField(term4615, term4615.getClass(), "sourcePosition", 0);
        setField(term4615, term4615.getClass(), "jsType", null);
        setField(term4615, term4615.getClass(), "parent", null);
        setField(term4613, term4613.getClass(), "next", term4615);
        setIntField(term4633, term4633.getClass(), "type", -378436487);
        setField(term4633, term4633.getClass(), "next", term4626);
        setField(term4633, term4633.getClass(), "first", term4628);
        setField(term4633, term4633.getClass(), "last", term4611);
        setField(term4633, term4633.getClass(), "propListHead", null);
        setIntField(term4633, term4633.getClass(), "sourcePosition", 0);
        setField(term4633, term4633.getClass(), "jsType", null);
        setField(term4633, term4633.getClass(), "parent", null);
        setField(term4613, term4613.getClass(), "first", term4633);
        setField(term4613, term4613.getClass(), "last", term4633);
        setField(term4613, term4613.getClass(), "propListHead", null);
        setIntField(term4613, term4613.getClass(), "sourcePosition", 0);
        setField(term4613, term4613.getClass(), "jsType", null);
        setField(term4613, term4613.getClass(), "parent", null);
        setField(term4611, term4611.getClass(), "next", term4613);
        setField(term4611, term4611.getClass(), "first", term4617);
        setField(term4611, term4611.getClass(), "last", term4619);
        setField(term4611, term4611.getClass(), "propListHead", null);
        setIntField(term4611, term4611.getClass(), "sourcePosition", 0);
        setField(term4611, term4611.getClass(), "jsType", null);
        setField(term4611, term4611.getClass(), "parent", null);
        term4638 = (Object[]) newArray("com.google.javascript.rhino.Node", 1);
        Object term4639 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4643 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4645 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4648 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4651 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4655 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4657 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4639, term4639.getClass(), "type", 584949609);
        setIntField(term4641, term4641.getClass(), "type", 879795058);
        setIntField(term4643, term4643.getClass(), "type", -1016087889);
        setIntField(term4645, term4645.getClass(), "type", 1968287557);
        setField(term4645, term4645.getClass(), "next", null);
        setField(term4645, term4645.getClass(), "first", null);
        setField(term4645, term4645.getClass(), "last", term4643);
        setField(term4645, term4645.getClass(), "propListHead", null);
        setIntField(term4645, term4645.getClass(), "sourcePosition", 0);
        setField(term4645, term4645.getClass(), "jsType", null);
        setField(term4645, term4645.getClass(), "parent", null);
        setField(term4643, term4643.getClass(), "next", term4645);
        setIntField(term4648, term4648.getClass(), "type", 1101385603);
        setField(term4648, term4648.getClass(), "next", null);
        setField(term4648, term4648.getClass(), "first", null);
        setField(term4648, term4648.getClass(), "last", null);
        setField(term4648, term4648.getClass(), "propListHead", null);
        setIntField(term4648, term4648.getClass(), "sourcePosition", 0);
        setField(term4648, term4648.getClass(), "jsType", null);
        setField(term4648, term4648.getClass(), "parent", null);
        setField(term4643, term4643.getClass(), "first", term4648);
        setIntField(term4651, term4651.getClass(), "type", -374887532);
        setField(term4651, term4651.getClass(), "next", null);
        setField(term4651, term4651.getClass(), "first", term4641);
        setField(term4651, term4651.getClass(), "last", term4641);
        setField(term4651, term4651.getClass(), "propListHead", null);
        setIntField(term4651, term4651.getClass(), "sourcePosition", 0);
        setField(term4651, term4651.getClass(), "jsType", null);
        setField(term4651, term4651.getClass(), "parent", null);
        setField(term4643, term4643.getClass(), "last", term4651);
        setField(term4643, term4643.getClass(), "propListHead", null);
        setIntField(term4643, term4643.getClass(), "sourcePosition", 0);
        setField(term4643, term4643.getClass(), "jsType", null);
        setField(term4643, term4643.getClass(), "parent", null);
        setField(term4641, term4641.getClass(), "next", term4643);
        setIntField(term4655, term4655.getClass(), "type", -608393431);
        setField(term4655, term4655.getClass(), "next", term4651);
        setIntField(term4657, term4657.getClass(), "type", -165487736);
        setField(term4657, term4657.getClass(), "next", term4655);
        setField(term4657, term4657.getClass(), "first", null);
        setField(term4657, term4657.getClass(), "last", term4645);
        setField(term4657, term4657.getClass(), "propListHead", null);
        setIntField(term4657, term4657.getClass(), "sourcePosition", 0);
        setField(term4657, term4657.getClass(), "jsType", null);
        setField(term4657, term4657.getClass(), "parent", null);
        setField(term4655, term4655.getClass(), "first", term4657);
        setField(term4655, term4655.getClass(), "last", term4639);
        setField(term4655, term4655.getClass(), "propListHead", null);
        setIntField(term4655, term4655.getClass(), "sourcePosition", 0);
        setField(term4655, term4655.getClass(), "jsType", null);
        setField(term4655, term4655.getClass(), "parent", null);
        setField(term4641, term4641.getClass(), "first", term4655);
        setField(term4641, term4641.getClass(), "last", term4655);
        setField(term4641, term4641.getClass(), "propListHead", null);
        setIntField(term4641, term4641.getClass(), "sourcePosition", 0);
        setField(term4641, term4641.getClass(), "jsType", null);
        setField(term4641, term4641.getClass(), "parent", null);
        setField(term4639, term4639.getClass(), "next", term4641);
        setField(term4639, term4639.getClass(), "first", term4645);
        setField(term4639, term4639.getClass(), "last", term4648);
        setField(term4639, term4639.getClass(), "propListHead", null);
        setIntField(term4639, term4639.getClass(), "sourcePosition", 0);
        setField(term4639, term4639.getClass(), "jsType", null);
        setField(term4639, term4639.getClass(), "parent", null);
        setElement(term4638, 0, term4639);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Array.newInstance(Class.forName("com.google.javascript.rhino.Node"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term4611;
        args[1] = term4638;
        try {
            callMethod(klass, "newCallNode", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


