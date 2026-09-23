package org.joda.time.chrono;

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
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ZonedChronology_getDateTimeMillis_230749326463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201432;

    public ZonedChronology_getDateTimeMillis_230749326463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term201432 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term201510 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term201588 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term201666 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term201744 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term201822 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term201900 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term201978 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term202056 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term202134 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term202212 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term202290 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term202368 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term202446 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term202524 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term202602 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term202680 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term202758 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term202836 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term202914 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term202992 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term203070 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term203148 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term203226 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term203304 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term203382 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term203460 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term203538 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term203616 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term203694 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term203772 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term203850 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term203928 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term204006 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term204084 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term204162 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term204240 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term204318 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term204396 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term204474 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term204552 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term204630 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term204708 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term204786 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term204864 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term204942 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term205020 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term205098 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term205176 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term205254 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term205332 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term205410 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term205488 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term205566 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term205644 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term205722 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term205800 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term205878 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term205956 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term206034 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term206112 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term206190 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term206268 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term206346 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term206424 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term206502 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term206580 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term206658 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term206736 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term206814 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term206892 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term206974 = newInstance(Class.forName("org.joda.time.chrono.LenientChronology"));
        setField(term206892, term206892.getClass(), "iBase", term206974);
        setField(term206814, term206814.getClass(), "iBase", term206892);
        setField(term206736, term206736.getClass(), "iBase", term206814);
        setField(term206658, term206658.getClass(), "iBase", term206736);
        setField(term206580, term206580.getClass(), "iBase", term206658);
        setField(term206502, term206502.getClass(), "iBase", term206580);
        setField(term206424, term206424.getClass(), "iBase", term206502);
        setField(term206346, term206346.getClass(), "iBase", term206424);
        setField(term206268, term206268.getClass(), "iBase", term206346);
        setField(term206190, term206190.getClass(), "iBase", term206268);
        setField(term206112, term206112.getClass(), "iBase", term206190);
        setField(term206034, term206034.getClass(), "iBase", term206112);
        setField(term205956, term205956.getClass(), "iBase", term206034);
        setField(term205878, term205878.getClass(), "iBase", term205956);
        setField(term205800, term205800.getClass(), "iBase", term205878);
        setField(term205722, term205722.getClass(), "iBase", term205800);
        setField(term205644, term205644.getClass(), "iBase", term205722);
        setField(term205566, term205566.getClass(), "iBase", term205644);
        setField(term205488, term205488.getClass(), "iBase", term205566);
        setField(term205410, term205410.getClass(), "iBase", term205488);
        setField(term205332, term205332.getClass(), "iBase", term205410);
        setField(term205254, term205254.getClass(), "iBase", term205332);
        setField(term205176, term205176.getClass(), "iBase", term205254);
        setField(term205098, term205098.getClass(), "iBase", term205176);
        setField(term205020, term205020.getClass(), "iBase", term205098);
        setField(term204942, term204942.getClass(), "iBase", term205020);
        setField(term204864, term204864.getClass(), "iBase", term204942);
        setField(term204786, term204786.getClass(), "iBase", term204864);
        setField(term204708, term204708.getClass(), "iBase", term204786);
        setField(term204630, term204630.getClass(), "iBase", term204708);
        setField(term204552, term204552.getClass(), "iBase", term204630);
        setField(term204474, term204474.getClass(), "iBase", term204552);
        setField(term204396, term204396.getClass(), "iBase", term204474);
        setField(term204318, term204318.getClass(), "iBase", term204396);
        setField(term204240, term204240.getClass(), "iBase", term204318);
        setField(term204162, term204162.getClass(), "iBase", term204240);
        setField(term204084, term204084.getClass(), "iBase", term204162);
        setField(term204006, term204006.getClass(), "iBase", term204084);
        setField(term203928, term203928.getClass(), "iBase", term204006);
        setField(term203850, term203850.getClass(), "iBase", term203928);
        setField(term203772, term203772.getClass(), "iBase", term203850);
        setField(term203694, term203694.getClass(), "iBase", term203772);
        setField(term203616, term203616.getClass(), "iBase", term203694);
        setField(term203538, term203538.getClass(), "iBase", term203616);
        setField(term203460, term203460.getClass(), "iBase", term203538);
        setField(term203382, term203382.getClass(), "iBase", term203460);
        setField(term203304, term203304.getClass(), "iBase", term203382);
        setField(term203226, term203226.getClass(), "iBase", term203304);
        setField(term203148, term203148.getClass(), "iBase", term203226);
        setField(term203070, term203070.getClass(), "iBase", term203148);
        setField(term202992, term202992.getClass(), "iBase", term203070);
        setField(term202914, term202914.getClass(), "iBase", term202992);
        setField(term202836, term202836.getClass(), "iBase", term202914);
        setField(term202758, term202758.getClass(), "iBase", term202836);
        setField(term202680, term202680.getClass(), "iBase", term202758);
        setField(term202602, term202602.getClass(), "iBase", term202680);
        setField(term202524, term202524.getClass(), "iBase", term202602);
        setField(term202446, term202446.getClass(), "iBase", term202524);
        setField(term202368, term202368.getClass(), "iBase", term202446);
        setField(term202290, term202290.getClass(), "iBase", term202368);
        setField(term202212, term202212.getClass(), "iBase", term202290);
        setField(term202134, term202134.getClass(), "iBase", term202212);
        setField(term202056, term202056.getClass(), "iBase", term202134);
        setField(term201978, term201978.getClass(), "iBase", term202056);
        setField(term201900, term201900.getClass(), "iBase", term201978);
        setField(term201822, term201822.getClass(), "iBase", term201900);
        setField(term201744, term201744.getClass(), "iBase", term201822);
        setField(term201666, term201666.getClass(), "iBase", term201744);
        setField(term201588, term201588.getClass(), "iBase", term201666);
        setField(term201510, term201510.getClass(), "iBase", term201588);
        setField(term201432, term201432.getClass(), "iBase", term201510);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = 0;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        try {
            callMethod(klass, "getDateTimeMillis", argTypes, term201432, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


