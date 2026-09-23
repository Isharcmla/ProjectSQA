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

public class Axis_setTickLabelFont_53679905480 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164;

    public Axis_setTickLabelFont_53679905480() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term164 = newInstance(Class.forName("java.awt.Font"));
        Object term165 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term166 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term167 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term169 = newInstance(Class.forName("java.lang.Object"));
        Object term170 = newInstance(Class.forName("java.lang.Object"));
        Object term196 = newInstance(Class.forName("java.lang.ref.SoftReference"));
        Object term198 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term199 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        setIntField(term167, term167.getClass(), "hash", 1760260348);
        setField(term167, term167.getClass(), "key", term169);
        setField(term167, term167.getClass(), "value", term170);
        setField(term167, term167.getClass(), "next", null);
        setElement(term166, 0, term167);
        setField(term165, term165.getClass(), "table", term166);
        setIntField(term165, term165.getClass(), "count", 1);
        setIntField(term165, term165.getClass(), "threshold", 8);
        setFloatField(term165, term165.getClass(), "loadFactor", 0.75F);
        setIntField(term165, term165.getClass(), "modCount", 1);
        setField(term165, term165.getClass(), "keySet", null);
        setField(term165, term165.getClass(), "entrySet", null);
        setField(term165, term165.getClass(), "values", null);
        setField(term164, term164.getClass(), "fRequestedAttributes", term165);
        setField(term164, term164.getClass(), "name", "jJCZpVmanW");
        setIntField(term164, term164.getClass(), "style", -522618178);
        setIntField(term164, term164.getClass(), "size", 1134449235);
        setFloatField(term164, term164.getClass(), "pointSize", 0.2707036F);
        setField(term164, term164.getClass(), "peer", null);
        setLongField(term164, term164.getClass(), "pData", -8400487765614892086L);
        setField(term164, term164.getClass(), "font2DHandle", null);
        setField(term164, term164.getClass(), "values", null);
        setBooleanField(term164, term164.getClass(), "hasLayoutAttributes", true);
        setBooleanField(term164, term164.getClass(), "createdFont", false);
        setBooleanField(term164, term164.getClass(), "nonIdentityTx", true);
        setIntField(term164, term164.getClass(), "hash", -883034806);
        setIntField(term164, term164.getClass(), "fontSerializedDataVersion", 1585847225);
        setLongField(term196, term196.getClass(), "timestamp", 5270370404989704783L);
        setField(term196, term196.getClass(), "referent", null);
        setField(term198, term198.getClass(), "lock", term199);
        setField(term198, term198.getClass(), "head", null);
        setLongField(term198, term198.getClass(), "queueLength", 7411271909051562686L);
        setField(term196, term196.getClass(), "queue", term198);
        setField(term196, term196.getClass(), "next", null);
        setField(term196, term196.getClass(), "discovered", null);
        setField(term164, term164.getClass(), "flmref", term196);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.axis.Axis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Font");
        Object[] args = new Object[1];
        args[0] = term164;
        try {
            callMethod(klass, "setTickLabelFont", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


