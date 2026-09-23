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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.util.HashMap;
import java.util.ArrayDeque;
import java.lang.Object;

public class ReferenceCollectingCallback_getReferencedVariables_34619513814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93;
     Object term1999;
     Object term1972;

    public ReferenceCollectingCallback_getReferencedVariables_34619513814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term94 = new HashMap();
        Object term109 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        setField(term109, term109.getClass(), "parent", null);
        setBooleanField(term109, term109.getClass(), "isHoisted", false);
        setBooleanField(term109, term109.getClass(), "isFunction", false);
        setBooleanField(term109, term109.getClass(), "isLoop", false);
        Object term113 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        setField(term113, term113.getClass(), "parent", null);
        setBooleanField(term113, term113.getClass(), "isHoisted", false);
        setBooleanField(term113, term113.getClass(), "isFunction", false);
        setBooleanField(term113, term113.getClass(), "isLoop", false);
        Object term117 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        setField(term117, term117.getClass(), "parent", null);
        setBooleanField(term117, term117.getClass(), "isHoisted", false);
        setBooleanField(term117, term117.getClass(), "isFunction", false);
        setBooleanField(term117, term117.getClass(), "isLoop", false);
        Object term121 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        setField(term121, term121.getClass(), "parent", null);
        setBooleanField(term121, term121.getClass(), "isHoisted", false);
        setBooleanField(term121, term121.getClass(), "isFunction", false);
        setBooleanField(term121, term121.getClass(), "isLoop", false);
        ArrayDeque term107 = new ArrayDeque();
        ((ArrayDeque) term107).add(term109);
        ((ArrayDeque) term107).add(term113);
        ((ArrayDeque) term107).add(term117);
        ((ArrayDeque) term107).add(term121);
        term93 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term93, term93.getClass(), "referenceMap", term94);
        setField(term93, term93.getClass(), "blockStack", term107);
        setField(term93, term93.getClass(), "behavior", null);
        setField(term93, term93.getClass(), "compiler", null);
        setField(term93, term93.getClass(), "varFilter", null);
        HashMap term2000 = new HashMap();
        Object term2004 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        setField(term2004, term2004.getClass(), "parent", null);
        setBooleanField(term2004, term2004.getClass(), "isHoisted", false);
        setBooleanField(term2004, term2004.getClass(), "isFunction", false);
        setBooleanField(term2004, term2004.getClass(), "isLoop", false);
        Object term2005 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        setField(term2005, term2005.getClass(), "parent", null);
        setBooleanField(term2005, term2005.getClass(), "isHoisted", false);
        setBooleanField(term2005, term2005.getClass(), "isFunction", false);
        setBooleanField(term2005, term2005.getClass(), "isLoop", false);
        Object term2006 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        setField(term2006, term2006.getClass(), "parent", null);
        setBooleanField(term2006, term2006.getClass(), "isHoisted", false);
        setBooleanField(term2006, term2006.getClass(), "isFunction", false);
        setBooleanField(term2006, term2006.getClass(), "isLoop", false);
        Object term2007 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        setField(term2007, term2007.getClass(), "parent", null);
        setBooleanField(term2007, term2007.getClass(), "isHoisted", false);
        setBooleanField(term2007, term2007.getClass(), "isFunction", false);
        setBooleanField(term2007, term2007.getClass(), "isLoop", false);
        ArrayDeque term2002 = new ArrayDeque();
        ((ArrayDeque) term2002).add(term2004);
        ((ArrayDeque) term2002).add(term2005);
        ((ArrayDeque) term2002).add(term2006);
        ((ArrayDeque) term2002).add(term2007);
        term1999 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term1999, term1999.getClass(), "referenceMap", term2000);
        setField(term1999, term1999.getClass(), "blockStack", term2002);
        setField(term1999, term1999.getClass(), "behavior", null);
        setField(term1999, term1999.getClass(), "compiler", null);
        setField(term1999, term1999.getClass(), "varFilter", null);
        HashMap term1973 = new HashMap();
        term1972 = newInstance(Class.forName("java.util.HashMap$KeySet"));
        setField(term1972, term1972.getClass(), "this$0", term1973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getReferencedVariables", argTypes, term93, args);
        assertTrue(recursiveEquals(term93, term1999));
        assertTrue(recursiveEquals(retValue, term1972));
    }

};


