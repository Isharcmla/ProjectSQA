package org.apache.commons.lang;

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
import static org.apache.commons.lang.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.EqualityUtils.*;

public class BooleanUtils_xor_783937265261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32230;
     Object term38581;

    public BooleanUtils_xor_783937265261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32230 = (boolean[]) newBooleanArray(511);
        setBooleanElement(term32230, 479, true);
        setBooleanElement(term32230, 480, true);
        setBooleanElement(term32230, 481, true);
        setBooleanElement(term32230, 482, true);
        setBooleanElement(term32230, 483, true);
        setBooleanElement(term32230, 484, true);
        setBooleanElement(term32230, 485, true);
        setBooleanElement(term32230, 486, true);
        setBooleanElement(term32230, 487, true);
        setBooleanElement(term32230, 488, true);
        setBooleanElement(term32230, 489, true);
        setBooleanElement(term32230, 490, true);
        setBooleanElement(term32230, 491, true);
        setBooleanElement(term32230, 492, true);
        setBooleanElement(term32230, 493, true);
        setBooleanElement(term32230, 494, true);
        setBooleanElement(term32230, 495, true);
        setBooleanElement(term32230, 496, true);
        setBooleanElement(term32230, 497, true);
        setBooleanElement(term32230, 498, true);
        setBooleanElement(term32230, 499, true);
        setBooleanElement(term32230, 500, true);
        setBooleanElement(term32230, 501, true);
        setBooleanElement(term32230, 502, true);
        setBooleanElement(term32230, 503, true);
        setBooleanElement(term32230, 504, true);
        setBooleanElement(term32230, 505, true);
        setBooleanElement(term32230, 506, true);
        setBooleanElement(term32230, 507, true);
        setBooleanElement(term32230, 508, true);
        setBooleanElement(term32230, 509, true);
        setBooleanElement(term32230, 510, true);
        term38581 = (boolean[]) newBooleanArray(511);
        setBooleanElement(term38581, 479, true);
        setBooleanElement(term38581, 480, true);
        setBooleanElement(term38581, 481, true);
        setBooleanElement(term38581, 482, true);
        setBooleanElement(term38581, 483, true);
        setBooleanElement(term38581, 484, true);
        setBooleanElement(term38581, 485, true);
        setBooleanElement(term38581, 486, true);
        setBooleanElement(term38581, 487, true);
        setBooleanElement(term38581, 488, true);
        setBooleanElement(term38581, 489, true);
        setBooleanElement(term38581, 490, true);
        setBooleanElement(term38581, 491, true);
        setBooleanElement(term38581, 492, true);
        setBooleanElement(term38581, 493, true);
        setBooleanElement(term38581, 494, true);
        setBooleanElement(term38581, 495, true);
        setBooleanElement(term38581, 496, true);
        setBooleanElement(term38581, 497, true);
        setBooleanElement(term38581, 498, true);
        setBooleanElement(term38581, 499, true);
        setBooleanElement(term38581, 500, true);
        setBooleanElement(term38581, 501, true);
        setBooleanElement(term38581, 502, true);
        setBooleanElement(term38581, 503, true);
        setBooleanElement(term38581, 504, true);
        setBooleanElement(term38581, 505, true);
        setBooleanElement(term38581, 506, true);
        setBooleanElement(term38581, 507, true);
        setBooleanElement(term38581, 508, true);
        setBooleanElement(term38581, 509, true);
        setBooleanElement(term38581, 510, true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.BooleanUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(boolean.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term32230;
        Object retValue = callMethod(klass, "xor", argTypes, null, args);
        assertTrue(recursiveEquals(term32230, term38581));
        assertTrue(recursiveEquals(retValue, false));
    }

};


