package org.apache.commons.compress.compressors.bzip2;

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
import java.io.IOException;
import static org.apache.commons.compress.compressors.bzip2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BZip2CompressorInputStream_setupRandPartB_189075015751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7103;

    public BZip2CompressorInputStream_setupRandPartB_189075015751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7103 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term7110 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.CRC"));
        Object term7129 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term7130 = (boolean[]) newBooleanArray(6);
        byte[] term7137 = (byte[]) newByteArray(0);
        byte[] term7138 = (byte[]) newByteArray(6);
        byte[] term7145 = (byte[]) newByteArray(6);
        int[] term7152 = (int[]) newIntArray(0);
        Object[] term7153 = (Object[]) newArray("[I", 4);
        int[] term7154 = (int[]) newIntArray(9);
        int[] term7164 = (int[]) newIntArray(3);
        int[] term7168 = (int[]) newIntArray(2);
        int[] term7171 = (int[]) newIntArray(0);
        Object[] term7172 = (Object[]) newArray("[I", 2);
        int[] term7173 = (int[]) newIntArray(3);
        int[] term7177 = (int[]) newIntArray(3);
        Object[] term7181 = (Object[]) newArray("[I", 8);
        int[] term7182 = (int[]) newIntArray(2);
        int[] term7185 = (int[]) newIntArray(0);
        int[] term7186 = (int[]) newIntArray(0);
        int[] term7187 = (int[]) newIntArray(0);
        int[] term7188 = (int[]) newIntArray(9);
        int[] term7198 = (int[]) newIntArray(6);
        int[] term7205 = (int[]) newIntArray(0);
        int[] term7206 = (int[]) newIntArray(7);
        int[] term7214 = (int[]) newIntArray(7);
        int[] term7222 = (int[]) newIntArray(1);
        char[] term7224 = (char[]) newCharArray(0);
        Object[] term7225 = (Object[]) newArray("[C", 0);
        byte[] term7226 = (byte[]) newByteArray(1);
        int[] term7228 = (int[]) newIntArray(7);
        byte[] term7236 = (byte[]) newByteArray(0);
        setIntField(term7103, term7103.getClass(), "last", -1378134881);
        setIntField(term7103, term7103.getClass(), "origPtr", -1887131478);
        setIntField(term7103, term7103.getClass(), "blockSize100k", 1916020077);
        setBooleanField(term7103, term7103.getClass(), "blockRandomised", true);
        setIntField(term7103, term7103.getClass(), "bsBuff", -1842191454);
        setIntField(term7103, term7103.getClass(), "bsLive", 384551988);
        setIntField(term7110, term7110.getClass(), "globalCrc", -1);
        setField(term7103, term7103.getClass(), "crc", term7110);
        setIntField(term7103, term7103.getClass(), "nInUse", -2021521187);
        setField(term7103, term7103.getClass(), "in", null);
        setBooleanField(term7103, term7103.getClass(), "decompressConcatenated", true);
        setIntField(term7103, term7103.getClass(), "currentChar", -2139205197);
        setIntField(term7103, term7103.getClass(), "currentState", 1646064199);
        setIntField(term7103, term7103.getClass(), "storedBlockCRC", -1135845415);
        setIntField(term7103, term7103.getClass(), "storedCombinedCRC", -1361921586);
        setIntField(term7103, term7103.getClass(), "computedBlockCRC", 593679468);
        setIntField(term7103, term7103.getClass(), "computedCombinedCRC", 747491);
        setIntField(term7103, term7103.getClass(), "su_count", 734222768);
        setIntField(term7103, term7103.getClass(), "su_ch2", 1545425140);
        setIntField(term7103, term7103.getClass(), "su_chPrev", -1580765555);
        setIntField(term7103, term7103.getClass(), "su_i2", -1295149055);
        setIntField(term7103, term7103.getClass(), "su_j2", -769814321);
        setIntField(term7103, term7103.getClass(), "su_rNToGo", 114898432);
        setIntField(term7103, term7103.getClass(), "su_rTPos", -193767503);
        setIntField(term7103, term7103.getClass(), "su_tPos", -2090918082);
        setCharField(term7103, term7103.getClass(), "su_z", 'x');
        setBooleanElement(term7130, 0, true);
        setBooleanElement(term7130, 2, true);
        setBooleanElement(term7130, 5, true);
        setField(term7129, term7129.getClass(), "inUse", term7130);
        setField(term7129, term7129.getClass(), "seqToUnseq", term7137);
        setByteElement(term7138, 0, (byte) -110);
        setByteElement(term7138, 1, (byte) -88);
        setByteElement(term7138, 2, (byte) 56);
        setByteElement(term7138, 3, (byte) -106);
        setByteElement(term7138, 4, (byte) 58);
        setByteElement(term7138, 5, (byte) 77);
        setField(term7129, term7129.getClass(), "selector", term7138);
        setByteElement(term7145, 0, (byte) -54);
        setByteElement(term7145, 1, (byte) -59);
        setByteElement(term7145, 2, (byte) 103);
        setByteElement(term7145, 3, (byte) 127);
        setByteElement(term7145, 4, (byte) 58);
        setByteElement(term7145, 5, (byte) -98);
        setField(term7129, term7129.getClass(), "selectorMtf", term7145);
        setField(term7129, term7129.getClass(), "unzftab", term7152);
        setIntElement(term7154, 0, 1505717672);
        setIntElement(term7154, 1, -1683274691);
        setIntElement(term7154, 2, -935900044);
        setIntElement(term7154, 3, 1747876558);
        setIntElement(term7154, 4, 833477776);
        setIntElement(term7154, 5, 2043960707);
        setIntElement(term7154, 6, 272179554);
        setIntElement(term7154, 7, 1717711536);
        setIntElement(term7154, 8, -606339607);
        setElement(term7153, 0, term7154);
        setIntElement(term7164, 0, 800440712);
        setIntElement(term7164, 1, -1976407622);
        setIntElement(term7164, 2, -552996061);
        setElement(term7153, 1, term7164);
        setIntElement(term7168, 0, -153013117);
        setIntElement(term7168, 1, 712181359);
        setElement(term7153, 2, term7168);
        setElement(term7153, 3, term7171);
        setField(term7129, term7129.getClass(), "limit", term7153);
        setIntElement(term7173, 0, -1943255435);
        setIntElement(term7173, 1, 868436312);
        setIntElement(term7173, 2, 1737963071);
        setElement(term7172, 0, term7173);
        setIntElement(term7177, 0, 6456997);
        setIntElement(term7177, 1, -797269627);
        setIntElement(term7177, 2, -224331928);
        setElement(term7172, 1, term7177);
        setField(term7129, term7129.getClass(), "base", term7172);
        setIntElement(term7182, 0, -587857163);
        setIntElement(term7182, 1, -2018093075);
        setElement(term7181, 0, term7182);
        setElement(term7181, 1, term7185);
        setElement(term7181, 2, term7186);
        setElement(term7181, 3, term7187);
        setIntElement(term7188, 0, 135879009);
        setIntElement(term7188, 1, 1923027847);
        setIntElement(term7188, 2, -1652693609);
        setIntElement(term7188, 3, -824893512);
        setIntElement(term7188, 4, -55435071);
        setIntElement(term7188, 5, -673356166);
        setIntElement(term7188, 6, 1876812694);
        setIntElement(term7188, 7, 461068473);
        setIntElement(term7188, 8, -1833298266);
        setElement(term7181, 4, term7188);
        setIntElement(term7198, 0, 746372422);
        setIntElement(term7198, 1, 1921465988);
        setIntElement(term7198, 2, -164438599);
        setIntElement(term7198, 3, -444441955);
        setIntElement(term7198, 4, -544005591);
        setIntElement(term7198, 5, -1379603462);
        setElement(term7181, 5, term7198);
        setElement(term7181, 6, term7205);
        setIntElement(term7206, 0, -1304965721);
        setIntElement(term7206, 1, 1661411651);
        setIntElement(term7206, 2, 175517901);
        setIntElement(term7206, 3, 335030203);
        setIntElement(term7206, 4, -474014477);
        setIntElement(term7206, 5, 1610419467);
        setIntElement(term7206, 6, 1155135931);
        setElement(term7181, 7, term7206);
        setField(term7129, term7129.getClass(), "perm", term7181);
        setIntElement(term7214, 0, -636910567);
        setIntElement(term7214, 1, 1896114203);
        setIntElement(term7214, 2, 1045745470);
        setIntElement(term7214, 3, 892741901);
        setIntElement(term7214, 4, -1724900201);
        setIntElement(term7214, 5, -758523003);
        setIntElement(term7214, 6, 1567184195);
        setField(term7129, term7129.getClass(), "minLens", term7214);
        setIntElement(term7222, 0, 63595623);
        setField(term7129, term7129.getClass(), "cftab", term7222);
        setField(term7129, term7129.getClass(), "getAndMoveToFrontDecode_yy", term7224);
        setField(term7129, term7129.getClass(), "temp_charArray2d", term7225);
        setByteElement(term7226, 0, (byte) 48);
        setField(term7129, term7129.getClass(), "recvDecodingTables_pos", term7226);
        setIntElement(term7228, 0, 1764150991);
        setIntElement(term7228, 1, 944653455);
        setIntElement(term7228, 2, -1819474400);
        setIntElement(term7228, 3, 783684648);
        setIntElement(term7228, 4, 553754005);
        setIntElement(term7228, 5, 1986699236);
        setIntElement(term7228, 6, -1729178560);
        setField(term7129, term7129.getClass(), "tt", term7228);
        setField(term7129, term7129.getClass(), "ll8", term7236);
        setField(term7103, term7103.getClass(), "data", term7129);
        setLongField(term7103, term7103.getClass(), "bytesRead", 8428634514691209827L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "setupRandPartB", argTypes, term7103, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


