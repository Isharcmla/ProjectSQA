package org.jfree.chart.axis;

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
import static org.jfree.chart.axis.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Axis_setLabelFont_3848743960 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25;

    public Axis_setLabelFont_3848743960() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25 = newInstance(Class.forName("java.awt.Font"));
        Object term26 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term27 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term28 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term30 = newInstance(Class.forName("java.lang.Object"));
        Object term31 = newInstance(Class.forName("java.lang.Object"));
        Object term57 = newInstance(Class.forName("java.lang.ref.SoftReference"));
        Object term59 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term60 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        setIntField(term28, term28.getClass(), "hash", 1478954658);
        setField(term28, term28.getClass(), "key", term30);
        setField(term28, term28.getClass(), "value", term31);
        setField(term28, term28.getClass(), "next", null);
        setElement(term27, 5, term28);
        setField(term26, term26.getClass(), "table", term27);
        setIntField(term26, term26.getClass(), "count", 1);
        setIntField(term26, term26.getClass(), "threshold", 8);
        setFloatField(term26, term26.getClass(), "loadFactor", 0.75F);
        setIntField(term26, term26.getClass(), "modCount", 1);
        setField(term26, term26.getClass(), "keySet", null);
        setField(term26, term26.getClass(), "entrySet", null);
        setField(term26, term26.getClass(), "values", null);
        setField(term25, term25.getClass(), "fRequestedAttributes", term26);
        setField(term25, term25.getClass(), "name", "sjlJAEtRrb");
        setIntField(term25, term25.getClass(), "style", 391863371);
        setIntField(term25, term25.getClass(), "size", -1922583790);
        setFloatField(term25, term25.getClass(), "pointSize", 0.13238746F);
        setField(term25, term25.getClass(), "peer", null);
        setLongField(term25, term25.getClass(), "pData", 2442117782898005296L);
        setField(term25, term25.getClass(), "font2DHandle", null);
        setField(term25, term25.getClass(), "values", null);
        setBooleanField(term25, term25.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term25, term25.getClass(), "createdFont", false);
        setBooleanField(term25, term25.getClass(), "nonIdentityTx", false);
        setIntField(term25, term25.getClass(), "hash", -616727354);
        setIntField(term25, term25.getClass(), "fontSerializedDataVersion", -1955890973);
        setLongField(term57, term57.getClass(), "timestamp", 6375119433582206027L);
        setField(term57, term57.getClass(), "referent", null);
        setField(term59, term59.getClass(), "lock", term60);
        setField(term59, term59.getClass(), "head", null);
        setLongField(term59, term59.getClass(), "queueLength", -8257434502486459194L);
        setField(term57, term57.getClass(), "queue", term59);
        setField(term57, term57.getClass(), "next", null);
        setField(term57, term57.getClass(), "discovered", null);
        setField(term25, term25.getClass(), "flmref", term57);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.axis.Axis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Font");
        Object[] args = new Object[1];
        args[0] = term25;
        try {
            callMethod(klass, "setLabelFont", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


