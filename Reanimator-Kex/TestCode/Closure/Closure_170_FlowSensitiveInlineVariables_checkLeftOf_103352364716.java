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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FlowSensitiveInlineVariables_checkLeftOf_103352364716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term463;
     Object term490;

    public FlowSensitiveInlineVariables_checkLeftOf_103352364716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term465 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term467 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term471 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term474 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term478 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term480 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term485 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term463, term463.getClass(), "type", -1476117762);
        setIntField(term465, term465.getClass(), "type", -341962980);
        setIntField(term467, term467.getClass(), "type", 1532716628);
        setIntField(term469, term469.getClass(), "type", -1801760683);
        setIntField(term471, term471.getClass(), "type", 1141317871);
        setField(term471, term471.getClass(), "next", null);
        setField(term471, term471.getClass(), "first", null);
        setField(term471, term471.getClass(), "last", null);
        setField(term471, term471.getClass(), "propListHead", null);
        setIntField(term471, term471.getClass(), "sourcePosition", 0);
        setField(term471, term471.getClass(), "jsType", null);
        setField(term471, term471.getClass(), "parent", null);
        setField(term469, term469.getClass(), "next", term471);
        setIntField(term474, term474.getClass(), "type", 890669485);
        setField(term474, term474.getClass(), "next", null);
        setField(term474, term474.getClass(), "first", null);
        setField(term474, term474.getClass(), "last", term471);
        setField(term474, term474.getClass(), "propListHead", null);
        setIntField(term474, term474.getClass(), "sourcePosition", 0);
        setField(term474, term474.getClass(), "jsType", null);
        setField(term474, term474.getClass(), "parent", null);
        setField(term469, term469.getClass(), "first", term474);
        setField(term469, term469.getClass(), "last", term467);
        setField(term469, term469.getClass(), "propListHead", null);
        setIntField(term469, term469.getClass(), "sourcePosition", 0);
        setField(term469, term469.getClass(), "jsType", null);
        setField(term469, term469.getClass(), "parent", null);
        setField(term467, term467.getClass(), "next", term469);
        setField(term467, term467.getClass(), "first", term471);
        setIntField(term478, term478.getClass(), "type", -893623680);
        setIntField(term480, term480.getClass(), "type", -1963434938);
        setField(term480, term480.getClass(), "next", null);
        setField(term480, term480.getClass(), "first", term474);
        setField(term480, term480.getClass(), "last", term469);
        setField(term480, term480.getClass(), "propListHead", null);
        setIntField(term480, term480.getClass(), "sourcePosition", 0);
        setField(term480, term480.getClass(), "jsType", null);
        setField(term480, term480.getClass(), "parent", null);
        setField(term478, term478.getClass(), "next", term480);
        setField(term478, term478.getClass(), "first", term465);
        setField(term478, term478.getClass(), "last", term465);
        setField(term478, term478.getClass(), "propListHead", null);
        setIntField(term478, term478.getClass(), "sourcePosition", 0);
        setField(term478, term478.getClass(), "jsType", null);
        setField(term478, term478.getClass(), "parent", null);
        setField(term467, term467.getClass(), "last", term478);
        setField(term467, term467.getClass(), "propListHead", null);
        setIntField(term467, term467.getClass(), "sourcePosition", 0);
        setField(term467, term467.getClass(), "jsType", null);
        setField(term467, term467.getClass(), "parent", null);
        setField(term465, term465.getClass(), "next", term467);
        setIntField(term485, term485.getClass(), "type", 906181092);
        setField(term485, term485.getClass(), "next", term478);
        setField(term485, term485.getClass(), "first", term480);
        setField(term485, term485.getClass(), "last", term463);
        setField(term485, term485.getClass(), "propListHead", null);
        setIntField(term485, term485.getClass(), "sourcePosition", 0);
        setField(term485, term485.getClass(), "jsType", null);
        setField(term485, term485.getClass(), "parent", null);
        setField(term465, term465.getClass(), "first", term485);
        setField(term465, term465.getClass(), "last", term485);
        setField(term465, term465.getClass(), "propListHead", null);
        setIntField(term465, term465.getClass(), "sourcePosition", 0);
        setField(term465, term465.getClass(), "jsType", null);
        setField(term465, term465.getClass(), "parent", null);
        setField(term463, term463.getClass(), "next", term465);
        setField(term463, term463.getClass(), "first", term469);
        setField(term463, term463.getClass(), "last", term471);
        setField(term463, term463.getClass(), "propListHead", null);
        setIntField(term463, term463.getClass(), "sourcePosition", 0);
        setField(term463, term463.getClass(), "jsType", null);
        setField(term463, term463.getClass(), "parent", null);
        term490 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term492 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term496 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term498 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term501 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term505 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term507 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term512 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term490, term490.getClass(), "type", 1045657203);
        setIntField(term492, term492.getClass(), "type", 1386130016);
        setIntField(term494, term494.getClass(), "type", 1072005683);
        setIntField(term496, term496.getClass(), "type", 1861318859);
        setIntField(term498, term498.getClass(), "type", 1474524152);
        setField(term498, term498.getClass(), "next", null);
        setField(term498, term498.getClass(), "first", null);
        setField(term498, term498.getClass(), "last", null);
        setField(term498, term498.getClass(), "propListHead", null);
        setIntField(term498, term498.getClass(), "sourcePosition", 0);
        setField(term498, term498.getClass(), "jsType", null);
        setField(term498, term498.getClass(), "parent", null);
        setField(term496, term496.getClass(), "next", term498);
        setIntField(term501, term501.getClass(), "type", 568954359);
        setField(term501, term501.getClass(), "next", null);
        setField(term501, term501.getClass(), "first", null);
        setField(term501, term501.getClass(), "last", term498);
        setField(term501, term501.getClass(), "propListHead", null);
        setIntField(term501, term501.getClass(), "sourcePosition", 0);
        setField(term501, term501.getClass(), "jsType", null);
        setField(term501, term501.getClass(), "parent", null);
        setField(term496, term496.getClass(), "first", term501);
        setField(term496, term496.getClass(), "last", term494);
        setField(term496, term496.getClass(), "propListHead", null);
        setIntField(term496, term496.getClass(), "sourcePosition", 0);
        setField(term496, term496.getClass(), "jsType", null);
        setField(term496, term496.getClass(), "parent", null);
        setField(term494, term494.getClass(), "next", term496);
        setField(term494, term494.getClass(), "first", term498);
        setIntField(term505, term505.getClass(), "type", -375014958);
        setIntField(term507, term507.getClass(), "type", 1107176718);
        setField(term507, term507.getClass(), "next", null);
        setField(term507, term507.getClass(), "first", term501);
        setField(term507, term507.getClass(), "last", term496);
        setField(term507, term507.getClass(), "propListHead", null);
        setIntField(term507, term507.getClass(), "sourcePosition", 0);
        setField(term507, term507.getClass(), "jsType", null);
        setField(term507, term507.getClass(), "parent", null);
        setField(term505, term505.getClass(), "next", term507);
        setField(term505, term505.getClass(), "first", term492);
        setField(term505, term505.getClass(), "last", term492);
        setField(term505, term505.getClass(), "propListHead", null);
        setIntField(term505, term505.getClass(), "sourcePosition", 0);
        setField(term505, term505.getClass(), "jsType", null);
        setField(term505, term505.getClass(), "parent", null);
        setField(term494, term494.getClass(), "last", term505);
        setField(term494, term494.getClass(), "propListHead", null);
        setIntField(term494, term494.getClass(), "sourcePosition", 0);
        setField(term494, term494.getClass(), "jsType", null);
        setField(term494, term494.getClass(), "parent", null);
        setField(term492, term492.getClass(), "next", term494);
        setIntField(term512, term512.getClass(), "type", 480137250);
        setField(term512, term512.getClass(), "next", term505);
        setField(term512, term512.getClass(), "first", term507);
        setField(term512, term512.getClass(), "last", term490);
        setField(term512, term512.getClass(), "propListHead", null);
        setIntField(term512, term512.getClass(), "sourcePosition", 0);
        setField(term512, term512.getClass(), "jsType", null);
        setField(term512, term512.getClass(), "parent", null);
        setField(term492, term492.getClass(), "first", term512);
        setField(term492, term492.getClass(), "last", term512);
        setField(term492, term492.getClass(), "propListHead", null);
        setIntField(term492, term492.getClass(), "sourcePosition", 0);
        setField(term492, term492.getClass(), "jsType", null);
        setField(term492, term492.getClass(), "parent", null);
        setField(term490, term490.getClass(), "next", term492);
        setField(term490, term490.getClass(), "first", term496);
        setField(term490, term490.getClass(), "last", term498);
        setField(term490, term490.getClass(), "propListHead", null);
        setIntField(term490, term490.getClass(), "sourcePosition", 0);
        setField(term490, term490.getClass(), "jsType", null);
        setField(term490, term490.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term463;
        args[1] = term490;
        args[2] = null;
        try {
            callMethod(klass, "checkLeftOf", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


